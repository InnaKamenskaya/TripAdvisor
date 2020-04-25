package org.kamenskaya.tripadvisor.app.infra.exception.flow;

import org.kamenskaya.tripadvisor.app.infra.exception.base.AppException;

public class FlowException extends AppException {

    public FlowException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowException(String message) {
        super(message);
    }
}
