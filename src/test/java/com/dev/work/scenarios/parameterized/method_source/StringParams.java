package com.dev.work.scenarios.parameterized.method_source;
import java.util.stream.Stream;

public class StringParams {
    static Stream<String> blankStrings() {
        return Stream.of(null, "", "  ");
    }
}