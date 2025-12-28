package com.dev.work.scenarios.exception_scenarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionScenarioTest {

    @Test
    void when_exception_thrown_then_assertion_succeeds() {

        Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void whenDerivedExceptionThrown_thenAssertionSucceeds() {
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            Integer.parseInt("1a");
        });
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void givenABlock_whenExecutes_thenEnsureNoExceptionThrown() {
        Assertions.assertDoesNotThrow(()->{
            Integer.parseInt("1000");
        });
    }

    @Test
    public void shouldThrowNullPointerException() {
        String str = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            str.length(); // This code block should throw the specified exception
        });
    }
}
