package com.dev.work.scenarios.parameterized.null_empty_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import source.null_empty_source.EmptyOrNullSourceScenario;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmptyOrNullSourceScenarioTest {

    @ParameterizedTest
    @NullSource                               //we can pass a single null value to a parameterized test method using @NullSource:
    void isBlank_ShouldReturnTrueForNullInputs(String input) {
        assertTrue(EmptyOrNullSourceScenario.isBlank(input));
    }

    @ParameterizedTest
    @EmptySource                              //primitive data types can’t accept null values, we can’t use the @NullSource for primitive arguments.,     Quite similarly, we can pass empty values using the @EmptySource annotation: ........@EmptySource, the composed annotation works for Strings, Collections, and arrays.
    void isBlank_ShouldReturnTrueForEmptyStrings(String input) {
        assertTrue(EmptyOrNullSourceScenario.isBlank(input));
    }

    @ParameterizedTest
    @NullAndEmptySource                       //To pass both null and empty values, we can use the composed @NullAndEmptySource annotation:
    void isBlank_ShouldReturnTrueForNullAndEmptyStrings(String input) {
        assertTrue(EmptyOrNullSourceScenario.isBlank(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"  ", "\t", "\n"})   //To pass a few more empty string variations to the parameterized test, we can combine @ValueSource, @NullSource, and @EmptySource:
    void isBlank_ShouldReturnTrueForAllTypesOfBlankStrings(String input) {
        assertTrue(EmptyOrNullSourceScenario.isBlank(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input){
        Assertions.assertTrue(EmptyOrNullSourceScenario.isBlank(input));
    }
}
