package org.apache.airavata.k8s.api.server.repository.task;

import org.apache.airavata.k8s.api.server.model.task.TaskOutput;
import org.springframework.data.repository.CrudRepository;

/**
 * TODO: Class level comments please
 *
 * @author dimuthu
 * @since 1.0.0-SNAPSHOT
 */
public interface TaskOutputRepository extends CrudRepository<TaskOutput, Long> {
}
