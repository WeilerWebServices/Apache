/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.apache.airavata.datacat.parsers.gridchem.gvb;/* The following code was generated by JFlex 1.4.3 on 9/11/14 6:26 PM */

import java_cup.runtime.Symbol;
import org.apache.airavata.datacat.parsers.gridchem.Settings;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/11/14 6:26 PM from the specification file
 * <tt>gvb.flex</tt>
 */
public class GVBLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ITER2 = 6;
  public static final int DASH = 10;
  public static final int INTVALUE = 12;
  public static final int SCF1 = 2;
  public static final int IGNOREALL = 24;
  public static final int ITER = 4;
  public static final int YYINITIAL = 0;
  public static final int ITER8 = 8;
  public static final int ITER7 = 22;
  public static final int ITER6 = 20;
  public static final int ITER5 = 18;
  public static final int FLOATVALUE = 14;
  public static final int ITER4 = 16;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  1,  1,  6,  6, 
     7,  7,  8,  8,  9,  9, 10, 10,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    10,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  0, 24,  4,  0, 
     1,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0,  0,  0,  0,  0,  0, 
     0, 13, 23, 18, 22,  8,  5, 16, 19,  6,  0,  0, 14,  0, 15, 12, 
     0, 21,  9, 20,  7,  0, 25,  0, 11, 17,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\13\0\2\1\2\2\1\1\2\3\3\1\3\4\10\1"+
    "\5\0\1\5\13\0\1\6\2\0\1\7\1\10\1\11"+
    "\1\12\65\0\1\13\1\14\1\15\62\0\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[163];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\234\0\266"+
    "\0\320\0\352\0\u0104\0\u011e\0\u0138\0\u011e\0\u0152\0\u016c"+
    "\0\u011e\0\u0186\0\u01a0\0\u01ba\0\u01d4\0\u011e\0\u01ee\0\u0208"+
    "\0\u0222\0\u023c\0\u0256\0\u0270\0\u028a\0\u02a4\0\u02be\0\u02d8"+
    "\0\u02f2\0\u030c\0\u01a0\0\u0326\0\u0340\0\u01ee\0\u035a\0\u0222"+
    "\0\u0374\0\u0256\0\u038e\0\u028a\0\u03a8\0\u02be\0\u03c2\0\u03dc"+
    "\0\u03f6\0\u0326\0\u0410\0\u042a\0\u0374\0\u038e\0\u03a8\0\u03c2"+
    "\0\u0444\0\u045e\0\u0478\0\u0492\0\u04ac\0\u04c6\0\u04e0\0\u04fa"+
    "\0\u0514\0\u052e\0\u0548\0\u0562\0\u057c\0\u0596\0\u05b0\0\u05ca"+
    "\0\u05e4\0\u05fe\0\u0618\0\u0632\0\u064c\0\u0666\0\u0680\0\u069a"+
    "\0\u06b4\0\u06ce\0\u06e8\0\u0702\0\u071c\0\u0736\0\u0750\0\u076a"+
    "\0\u0784\0\u079e\0\u07b8\0\u07d2\0\u07ec\0\u0806\0\u0820\0\u083a"+
    "\0\u0854\0\u086e\0\u0888\0\u08a2\0\u08bc\0\u08d6\0\u08f0\0\u090a"+
    "\0\u0924\0\u093e\0\u0958\0\u0972\0\u098c\0\u011e\0\u011e\0\u011e"+
    "\0\u09a6\0\u09c0\0\u09da\0\u09f4\0\u0a0e\0\u0a28\0\u0a42\0\u0a5c"+
    "\0\u0a76\0\u0a90\0\u0aaa\0\u0ac4\0\u0ade\0\u0af8\0\u0b12\0\u0b2c"+
    "\0\u0b46\0\u0b60\0\u0b7a\0\u0b94\0\u0bae\0\u0bc8\0\u0be2\0\u0bfc"+
    "\0\u0c16\0\u0c30\0\u0c4a\0\u0c64\0\u0c7e\0\u0c98\0\u0cb2\0\u0ccc"+
    "\0\u0ce6\0\u0d00\0\u0d1a\0\u0d34\0\u0d4e\0\u0d68\0\u0d82\0\u0d9c"+
    "\0\u0db6\0\u0dd0\0\u0dea\0\u0e04\0\u0e1e\0\u0e38\0\u0e52\0\u0e6c"+
    "\0\u0e86\0\u0ea0\0\u011e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[163];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\6\14\1\15\56\14\1\16\1\17\25\14\1\20\2\14"+
    "\1\21\1\22\30\14\2\23\1\24\24\14\1\24\27\14"+
    "\1\25\3\14\1\26\3\27\24\26\1\30\1\26\1\14"+
    "\2\31\1\32\24\14\1\32\2\14\2\33\1\34\24\14"+
    "\1\34\2\14\2\35\1\36\24\14\1\36\2\14\2\37"+
    "\1\40\24\14\1\40\1\14\41\0\1\41\23\0\2\17"+
    "\57\0\1\42\2\0\2\22\30\0\2\43\1\0\1\44"+
    "\26\0\2\43\37\0\1\45\22\0\2\46\30\0\2\46"+
    "\25\0\1\47\2\0\2\50\1\0\1\51\26\0\2\50"+
    "\30\0\2\52\1\0\1\53\26\0\2\52\30\0\2\54"+
    "\1\0\1\55\26\0\2\54\30\0\2\56\1\0\1\57"+
    "\26\0\2\56\37\0\1\60\51\0\1\61\2\0\2\62"+
    "\46\0\1\63\42\0\1\64\2\0\2\65\30\0\2\66"+
    "\30\0\2\67\30\0\2\70\40\0\1\71\50\0\1\72"+
    "\25\0\1\73\35\0\1\74\13\0\1\75\47\0\1\76"+
    "\7\0\1\77\53\0\1\100\11\0\1\101\51\0\1\102"+
    "\10\0\1\103\52\0\1\104\14\0\1\105\46\0\1\106"+
    "\22\0\1\107\40\0\1\110\13\0\1\111\47\0\1\112"+
    "\13\0\1\113\47\0\1\114\13\0\1\115\47\0\1\116"+
    "\23\0\1\117\37\0\1\120\13\0\1\121\47\0\1\122"+
    "\15\0\1\123\45\0\1\124\13\0\1\125\47\0\1\126"+
    "\20\0\1\127\42\0\1\130\13\0\1\131\47\0\1\132"+
    "\32\0\1\133\30\0\1\134\10\0\1\135\52\0\1\136"+
    "\11\0\1\137\51\0\1\140\15\0\1\141\45\0\1\142"+
    "\12\0\1\143\50\0\1\144\10\0\1\145\52\0\1\146"+
    "\21\0\1\147\41\0\1\150\16\0\1\151\44\0\1\152"+
    "\11\0\1\153\51\0\1\154\17\0\1\155\43\0\1\156"+
    "\27\0\1\157\33\0\1\160\13\0\1\161\27\0\1\162"+
    "\40\0\1\163\22\0\1\164\32\0\1\165\40\0\1\166"+
    "\32\0\1\167\22\0\1\170\31\0\1\171\31\0\1\172"+
    "\31\0\1\173\31\0\1\174\31\0\1\175\31\0\1\176"+
    "\27\0\1\177\33\0\1\200\41\0\1\201\32\0\1\202"+
    "\23\0\1\203\33\0\1\204\32\0\1\205\21\0\1\206"+
    "\33\0\1\207\31\0\1\210\31\0\1\211\31\0\1\212"+
    "\31\0\1\213\31\0\1\214\31\0\1\215\31\0\1\216"+
    "\43\0\1\217\32\0\1\220\26\0\1\221\35\0\1\222"+
    "\10\0\1\223\36\0\1\224\31\0\1\225\31\0\1\226"+
    "\31\0\1\227\31\0\1\230\31\0\1\231\31\0\1\232"+
    "\33\0\1\233\26\0\1\234\47\0\1\235\6\0\1\236"+
    "\37\0\1\237\37\0\1\240\22\0\1\241\35\0\1\242"+
    "\42\0\1\243\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3770];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\13\0\1\11\1\1\1\11\2\1\1\11\4\1\1\11"+
    "\12\1\5\0\1\1\13\0\1\1\2\0\4\1\65\0"+
    "\3\11\62\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[163];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public static boolean DEBUG = false; 


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public GVBLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public GVBLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { if  (Settings.DEBUG) System.out.println("GVBFlex: Found float3");
     yybegin(ITER); 
      return new Symbol(GVBSym.FLOAT3);
          }
        case 15: break;
        case 11: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: Found the dash"); 
               yybegin(DASH);
          }
        case 16: break;
        case 13: 
          { yybegin(DASH);
          }
        case 17: break;
        case 14: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: Found START OF"); 
	   yybegin(ITER); 
	   return new Symbol(GVBSym.FOUNDITER);
          }
        case 18: break;
        case 7: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: Found the energy"); 
   if (Settings.DEBUG) System.out.println(yytext()); 
   yybegin(ITER5); 
   return new Symbol(GVBSym.ENERGY, new Float(yytext()));
          }
        case 19: break;
        case 6: 
          { if  (Settings.DEBUG) System.out.println("GVBFlex: Found float4"); 
     yybegin(ITER); 
      return new Symbol(GVBSym.FLOAT4);
          }
        case 20: break;
        case 12: 
          { yybegin(IGNOREALL); 
  return new Symbol(GVBSym.SCFDONE);
          }
        case 21: break;
        case 9: 
          { if  (Settings.DEBUG) System.out.println("GVBFlex: Found float2"); 
  yybegin (ITER7); 
   return new Symbol(GVBSym.FLOAT2);
          }
        case 22: break;
        case 2: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: Found the first integer in the iteration"); 
   if (Settings.DEBUG) System.out.println(yytext()); 
   yybegin(ITER2); 
   return new Symbol(GVBSym.INTCycle, new Integer(yytext()));
          }
        case 23: break;
        case 8: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: ITER5"); 
   if (Settings.DEBUG) System.out.println("GVBFlex: Found float1"); 
   yybegin (ITER6); 
    return new Symbol(GVBSym.FLOAT1);
          }
        case 24: break;
        case 5: 
          { if  (Settings.DEBUG) System.out.println("GVBFlex: Found float value"); 
  yybegin(ITER);
          }
        case 25: break;
        case 4: 
          { if  (Settings.DEBUG) System.out.println("GVBFlex: Found new line");
          }
        case 26: break;
        case 1: 
          { 
          }
        case 27: break;
        case 3: 
          { if (Settings.DEBUG) System.out.println("GVBFlex: Found the second integer in the iteration");                                                                                     if (Settings.DEBUG) System.out.println(yytext());                                        yybegin(ITER4);                                                                           return new Symbol(GVBSym.INT1, new Integer(yytext()));
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(GVBSym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = GVBSym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java GVBLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        GVBLexer scanner = null;
        try {
          scanner = new GVBLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
