/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.any23.extractor.rdfa;

import org.apache.any23.extractor.ExtractionContext;
import org.apache.any23.extractor.ExtractionException;
import org.apache.any23.extractor.ExtractionParameters;
import org.apache.any23.extractor.ExtractionResult;
import org.apache.any23.extractor.IssueReport;
import org.apache.any23.extractor.rdf.BaseRDFExtractor;
import org.apache.any23.rdf.Any23ValueFactoryWrapper;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.rio.helpers.RDFaParserSettings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.semarglproject.rdf.rdfa.RdfaParser;
import org.semarglproject.rdf4j.rdf.rdfa.SemarglParserSettings;
import org.semarglproject.sink.XmlSink;
import org.semarglproject.source.StreamProcessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Hans Brende (hansbrende@apache.org)
 */
abstract class BaseRDFaExtractor extends BaseRDFExtractor {

    private final short version;

    BaseRDFaExtractor(short version) {
        super(false, false);
        this.version = version;
    }

    @Override
    public void run(ExtractionParameters extractionParameters, ExtractionContext extractionContext, InputStream in, ExtractionResult extractionResult) throws IOException, ExtractionException {

        SemarglSink rdfaSink = new SemarglSink(extractionResult, new Any23ValueFactoryWrapper(
                SimpleValueFactory.getInstance(),
                extractionResult,
                extractionContext.getDefaultLanguage()
        ));

        XmlSink xmlSink = RdfaParser.connect(rdfaSink);
        xmlSink.setProperty(StreamProcessor.PROCESSOR_GRAPH_HANDLER_PROPERTY, rdfaSink);
        xmlSink.setProperty(RdfaParser.RDFA_VERSION_PROPERTY, version);
        xmlSink.setProperty(RdfaParser.ENABLE_VOCAB_EXPANSION, RDFaParserSettings.VOCAB_EXPANSION_ENABLED.getDefaultValue());
        xmlSink.setProperty(RdfaParser.ENABLE_PROCESSOR_GRAPH, SemarglParserSettings.PROCESSOR_GRAPH_ENABLED.getDefaultValue());

        String baseUri = extractionContext.getDocumentIRI().stringValue();
        xmlSink.setBaseUri(baseUri);
        Document doc = Jsoup.parse(in, null, baseUri, Parser.htmlParser().settings(ParseSettings.preserveCase));
        try {
            xmlSink.startDocument();
            doc.traverse(new JsoupScanner(xmlSink));
            xmlSink.endDocument();
        } catch (Exception e) {
            extractionResult.notifyIssue(IssueReport.IssueLevel.FATAL, toString(e), -1, -1);
        }
    }

    @SuppressWarnings("Duplicates")
    private static String toString(Throwable th) {
        StringWriter writer = new StringWriter();
        try (PrintWriter pw = new PrintWriter(writer)) {
            th.printStackTrace(pw);
        }
        String string = writer.toString();
        if (string.length() > 1024) {
            return string.substring(0, 1021) + "...";
        }
        return string;
    }

}
