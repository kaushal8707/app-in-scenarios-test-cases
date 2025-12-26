package com.dev.work.scenarios.parameterized.method_source;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import source.method_source.Method_ArgumentSource_Scenario;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class MethodArgumentSourceScenarioTest {

    @ParameterizedTest
    @MethodSource("provideStringForIsBlanks")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        assertEquals(expected, Method_ArgumentSource_Scenario.isBlank(input));
    }
    private static Stream<Arguments> provideStringForIsBlanks(){
    return Stream.of(
            Arguments.of(null, true),
            Arguments.of("", true),
            Arguments.of(" ", true),
            Arguments.of("not blank", false)
    );
    }


    @ParameterizedTest
    @MethodSource // hmm, no method name ...
    void isBlank_ShouldReturnTrueForNullOrBlankStringsOneArgument(String input) {
        assertTrue(Method_ArgumentSource_Scenario.isBlank(input));
    }
    private static Stream<String> isBlank_ShouldReturnTrueForNullOrBlankStringsOneArgument() {
        return Stream.of(null, "", "  ");
    }


    @ParameterizedTest
    @MethodSource("com.dev.work.scenarios.parameterized.method_source.StringParams#blankStrings")
    void isBlank_ShouldReturnTrueForNullOrBlankStringsExternalSource(String input) {
        assertTrue(Method_ArgumentSource_Scenario.isBlank(input));
    }

}
