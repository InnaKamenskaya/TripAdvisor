package org.kamenskaya.tripadvisor.app.infra.exception;

import org.kamenskaya.tripadvisor.app.infra.exception.base.AppException;

public class ConfigurationException extends AppException {
    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }
}
