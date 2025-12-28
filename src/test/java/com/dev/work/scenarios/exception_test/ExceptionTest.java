package com.dev.work.scenarios.exception_test;

import exception.ExceptionScenario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    static ExceptionScenario exObj = null;

    @BeforeAll
    static void init() {
        exObj = new ExceptionScenario();
    }

    @Test
    public void testExceptionIsThrown() {
        // Assert that an IllegalArgumentException is thrown when input is negative
        assertThrows(IllegalArgumentException.class, () -> {
            exObj.validateInput(-1);
        });
    }

    @Test
    public void testExceptionMessage() {
        // Capture the exception object
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            exObj.validateInput(-1);
        });
        // Assert the message of the caught exception
        Assertions.assertEquals("Negative numbers are not allowed.", exception.getMessage());
    }
}
