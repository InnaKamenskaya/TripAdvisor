package org.kamenskaya.tripadvisor.app.infra.exception.base;

public class AppException extends RuntimeException {

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }
}
