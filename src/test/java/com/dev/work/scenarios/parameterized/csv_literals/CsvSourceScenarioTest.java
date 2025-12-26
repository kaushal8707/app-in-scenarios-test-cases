package com.dev.work.scenarios.parameterized.csv_literals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import source.csv_literals.CsvSourceScenario;

public class CsvSourceScenarioTest {

    @ParameterizedTest
    @CsvSource({"test, TEST",
                "TeSt, TEST",
                "Java, JAVA"})
    void toUpperCase_passed_arguments_should_convert_in_uppercase(String input, String result){
        String res = CsvSourceScenario.convertToUpperCase(input);
        Assertions.assertEquals(result, res);
    }

    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = CsvSourceScenario.convertToLowerCase(input);
        Assertions.assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,6", "4,5,6,120", "7,8,1,56"})
    void numberToMultiply(int num1, int num2, int num3, int res){
        Assertions.assertEquals(res, (num1 * num2 * num3));
    }
}
