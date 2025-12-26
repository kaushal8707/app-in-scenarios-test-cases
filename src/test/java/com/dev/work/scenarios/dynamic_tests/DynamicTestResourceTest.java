package com.dev.work.scenarios.dynamic_tests;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import source.dynamic_test.DynamicTestResource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicTestResourceTest {

    @TestFactory
    Collection<DynamicTest> dynamicTestWithMathematicalOperation_using_Collection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition of 2 num 5 and 5 ",
                        ()-> assertEquals(10, DynamicTestResource.addNum(5, 5))),
                DynamicTest.dynamicTest("multiplication of 2 num 3 and 2 ",
                        ()-> assertEquals(6, DynamicTestResource.multiplyNum(3, 2))),
                DynamicTest.dynamicTest("square of 5 ",
                        ()-> assertEquals(25, DynamicTestResource.squareNum(5))),
                DynamicTest.dynamicTest("6 is odd ? ",
                        ()-> assertEquals(false, DynamicTestResource.isOddNum(6))),
                DynamicTest.dynamicTest("5 is odd ? ",
                        ()-> assertEquals(true, DynamicTestResource.isOddNum(5))),
                DynamicTest.dynamicTest("6 is odd ? ",
                        ()-> assertEquals(true, DynamicTestResource.isOddNum(6)))
        );
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsWithIntStreams() {
        return IntStream.iterate(0, n-> n + 2).limit(10)
                .mapToObj(n-> DynamicTest.dynamicTest(" test " + n,
                        ()-> assertTrue(n % 2 == 0)));
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsWithFewStreamsData() {
        String input = "Have a good day";
        return Arrays.stream(input.split(" "))
                .map(parserData-> DynamicTest.dynamicTest(parserData + " is contains character 'a' ",
                        ()-> assertTrue(parserData.contains("a")))
                );
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsWithIterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsWithIterator() {
        return Arrays.asList(
                        DynamicTest.dynamicTest("Add test",
                                () -> assertEquals(2, Math.addExact(1, 1))),
                        DynamicTest.dynamicTest("Multiply Test",
                                () -> assertEquals(4, Math.multiplyExact(2, 2))))
                .iterator();
    }
}
