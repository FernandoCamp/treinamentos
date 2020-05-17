package br.com.fernando.windowpattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static br.com.fernando.windowpattern.SubarraySum.*;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubarraySumTest {

    @Test
    void countFirstNNumbers() {
        assertEquals(7, sumFirstNNumbers(asList(3, 4, 2, 10, 15), 2));
    }
    @Test
    void countFirstNNumbersWithNegativeNumbers() {
        assertEquals(3, sumFirstNNumbers(asList(-1, 4, 2, 10, 15), 2));
    }

    static Stream<Arguments> arraysExpectedBiggerNNumbersAndArraysAndNumbersSequence() {
        return Stream.of(
                arguments(11, asList(4, 5, 6, 2, 2, 2), 2),
                arguments(27, asList(4, 5, 6, 2, 2, 25), 2),
                arguments(57, asList(22, 5, 6, 2, 2, 55), 2),
                arguments(11, asList(-1, -3, 4, 5, 6, 2, 2, 2), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysExpectedBiggerNNumbersAndArraysAndNumbersSequence")
    void countMaxSumOfSubarray(int expectedValue, List<Integer> numbers, int sequenceOfNumbers) {
        assertEquals(expectedValue, maxSubarraySum(numbers, sequenceOfNumbers));
    }

}