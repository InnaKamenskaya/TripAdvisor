package org.kamenskaya.tripadvisor.app.infra.exception;

import org.kamenskaya.tripadvisor.app.infra.exception.base.AppException;

public class PersistenceException extends AppException {
    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(String message) {
        super(message);
    }
}
