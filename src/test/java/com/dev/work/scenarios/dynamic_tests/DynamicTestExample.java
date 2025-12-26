package com.dev.work.scenarios.dynamic_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class DynamicTestExample {

    /** Dynamic test using collection */
    @TestFactory
    Collection<DynamicTest> dynamicTestWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test 1 + 1 = 2", ()-> Assertions.assertEquals(2, 1 + 1)),
                DynamicTest.dynamicTest("Test 2 * 2 = 4", ()-> Assertions.assertEquals(4, 2 * 2)),
                DynamicTest.dynamicTest("Test 3 - 1 = 2", ()-> Assertions.assertEquals(2, 3 - 1))
        );
    }

    /** Dynamic test using stream */
    @TestFactory
    Stream<DynamicTest> dynamicTestWithStream(){
        return Stream.of("apple", "banana", "cherry")
                .map(fruit-> DynamicTest.dynamicTest("check if " +fruit +" contains 'a' ",
                        ()-> Assertions.assertTrue(fruit.contains("a"))));
    }

    /** Dynamic test using containers to group tests */
    @TestFactory
    Stream<DynamicContainer> dynamicTestsWithContainers(){
        return Stream.of("Group 1", "Group 2", "Group 3")
                .map(group-> DynamicContainer.dynamicContainer(group, Stream.of(
                        DynamicTest.dynamicTest("Check if 1 equals 1", () -> Assertions.assertTrue(1 == 1)),
                        DynamicTest.dynamicTest("Check if 2 equals 2", () -> Assertions.assertTrue(2 == 2))
                )));
    }


}
