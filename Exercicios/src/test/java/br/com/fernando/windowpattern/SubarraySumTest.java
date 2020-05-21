package br.com.fernando.windowpattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static br.com.fernando.windowpattern.SubarraySum.*;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
                arguments(73, asList(22, 5, 6, 8, 10, 55), 3),
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

    static Stream<Arguments> arraysExpectedBiggerNNumbersAndArraysAndNumbersSequenceForMinSubarray() {
        return Stream.of(
                arguments(4, asList(4, 5, 6, 2, 2, 2), 2),
                arguments(9, asList(4, 5, 6, 8, 2, 25), 2),
                arguments(0, asList(-1, -3, 4, 5, 6, 2, 2, 2), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysExpectedBiggerNNumbersAndArraysAndNumbersSequenceForMinSubarray")
    void countMinSumOfSubarray(int expectedValue, List<Integer> numbers, int sequenceOfNumbers) {
        assertEquals(expectedValue, minSubarraySum(numbers, sequenceOfNumbers));
    }

    static Stream<Arguments> arraysExpectedBiggerNNumbersAndArraysAndNumbersSequenceSecondExercise() {
        return Stream.of(
                arguments(asList(100, 200, 300, 400), 2, 700),
                arguments(asList(1, 4, 2, 10, 23, 3, 1, 0, 20), 4, 39),
                arguments(asList(-3, 4, 0, -2, 6, -1), 2, 5),
                arguments(asList(3, -2, 7, -4, 1, -1, 4, -2, 1), 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysExpectedBiggerNNumbersAndArraysAndNumbersSequenceSecondExercise")
    void countMaxSumOfSubarraySecondExercise(List<Integer> numbers, int lenghtOfSubarray, int expectedValue) {
        assertEquals(expectedValue, maxSubarraySum(numbers, lenghtOfSubarray));
    }

    @Test
    void testIfReturnNullWhenLengthOfSubarrayIsBiggerThenArray() {
        assertNull(maxSubarraySum(asList(2, 3), 3));
    }

}
