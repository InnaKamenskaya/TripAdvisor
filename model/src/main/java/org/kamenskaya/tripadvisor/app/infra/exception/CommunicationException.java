package org.kamenskaya.tripadvisor.app.infra.exception;

import org.kamenskaya.tripadvisor.app.infra.exception.base.AppException;

public class CommunicationException extends AppException {
    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(String message) {
        super(message);
    }
}
