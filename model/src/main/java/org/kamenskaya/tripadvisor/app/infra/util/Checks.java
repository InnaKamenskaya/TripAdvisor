package org.kamenskaya.tripadvisor.app.infra.util;

import org.kamenskaya.tripadvisor.app.infra.exception.flow.InvalidParameterException;

public class Checks {

    private Checks() {
    }

    public static void checkParameter(boolean check, String message) throws InvalidParameterException {
        if (!check){
            throw new InvalidParameterException(message);
        }
    }
}
