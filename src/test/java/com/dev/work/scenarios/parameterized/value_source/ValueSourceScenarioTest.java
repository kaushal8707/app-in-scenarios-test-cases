package com.dev.work.scenarios.parameterized.value_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import source.value_source.ValueSourceScenario;

public class ValueSourceScenarioTest {

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3,15,Integer.MAX_VALUE})
    void isOdd_ShouldReturnTrueForOddNumbers(int number){
        Assertions.assertTrue(ValueSourceScenario.isOdd(number));
    }
}
