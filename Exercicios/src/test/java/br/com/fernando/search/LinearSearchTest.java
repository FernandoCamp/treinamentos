package br.com.fernando.search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LinearSearchTest {

    static Stream<Arguments> linearSearchElements() {
        return Stream.of(
                arguments(asList(10, 15, 20, 25, 30), 15, 1),
                arguments(asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0), 4, 5),
                arguments(Collections.singletonList(100), 100, 0),
                arguments(asList(1, 2, 3, 4, 5), 6, -1),
                arguments(asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0), 10, -1),
                arguments(Collections.singletonList(100), 200, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("linearSearchElements")
    void testLinearSearch(List<Integer> numbers, int expectedValue, int expectedIndex) {
        assertEquals(expectedIndex, LinearSearch.linearSearch(numbers, expectedValue));
    }
}