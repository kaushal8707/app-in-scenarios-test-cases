package com.dev.work.scenarios.repeated_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RepeatedTestsScenariosDemo {

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before Each Test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("After Each Test");
        System.out.println("=====================");
    }

    @RepeatedTest(3)
    void repeatedTest(TestInfo testInfo) {
        System.out.println("Executing repeated test");
        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }

    @RepeatedTest(value = 10)
    void whenGeneratingRandomNumber_thenNumberShouldBeWithinRange() {
        Random random = new Random();
        int number = random.nextInt(10);
        assertTrue(number < 8);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void repeatedTestWithLongName() {
        System.out.println("Executing repeated test with long name");
        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }

    @RepeatedTest(value = 3, name = "Custom name {currentRepetition}/{totalRepetitions}")
    void repeatedTestWithCustomDisplayName(TestInfo testInfo) {
        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }

}
