package org.kamenskaya.tripadvisor.app.infra.util;

import org.junit.Test;
import org.kamenskaya.tripadvisor.app.infra.exception.flow.InvalidParameterException;

import static org.junit.Assert.*;

public class ChecksTest {

    @Test
    public void testCheckParameterGetException() {

        try {
            Checks.checkParameter(false, "test");
            assertTrue(false);
        }catch (Exception ex){
            assertSame(ex.getClass(), InvalidParameterException.class);
            assertEquals(ex.getMessage(), "test");
        }
    }

    @Test
    public void testCheckParameterNoException(){
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
}