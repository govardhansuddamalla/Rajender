package com.org.project.utills;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by rajender.koyyeda on 08-02-2022.
 */
public interface LogConfiguration {
    default Logger log() {
        return LogManager.getLogger(this.getClass());
    }
}
