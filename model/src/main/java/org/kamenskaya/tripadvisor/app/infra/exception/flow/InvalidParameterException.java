package org.kamenskaya.tripadvisor.app.infra.exception.flow;

public class InvalidParameterException extends FlowException {
    public InvalidParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
