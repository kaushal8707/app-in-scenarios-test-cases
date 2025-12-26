package com.dev.work.scenarios.parameterized.csv_files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import source.csv_files.CsvFileScenario;

public class CsvFilesScenarioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1)
    void toUpperCase_passed_arguments_should_convert_in_uppercase(String input, String result){
        String res = CsvFileScenario.convertToUpperCase(input);
        Assertions.assertEquals(result, res);
    }
}
