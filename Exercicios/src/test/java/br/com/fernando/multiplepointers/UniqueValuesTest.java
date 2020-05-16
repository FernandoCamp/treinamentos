package br.com.fernando.multiplepointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UniqueValuesTest {

    static Stream<Arguments> integersSortedList() {
        return Stream.of(
                arguments(Collections.singletonList(1), Arrays.asList(1, 1)),
                arguments(Arrays.asList(1, 4, 6, 7, 8), Arrays.asList(1, 4, 6, 7, 8, 8))
        );
    }

    @ParameterizedTest
    @MethodSource("integersSortedList")
    void shouldReturnOnlyUniqueValues(List<Integer> expected, List<Integer> actual) {
        assertEquals(expected, UniqueValues.returnUniqueValues(actual));
    }

}