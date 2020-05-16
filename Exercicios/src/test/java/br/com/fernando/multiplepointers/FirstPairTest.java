package br.com.fernando.multiplepointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FirstPairTest {

    static Stream<Arguments> validPairList() {
        return Stream.of(
                arguments(asList(-2, 2), asList(-3, -2, 0, 1, 2)),
                arguments(asList(-3, 3), asList(-3, -2, 1, 3)),
                arguments(asList(-15, 15), asList(-50, -40, -30, -29, -15, -3, -2, 1, 2, 15)),
                arguments(asList(-15, 15), asList(-15, -3, -2, 1, 2, 15, 29, 30, 40, 50, 69, 234)),
                arguments(Collections.emptyList(), asList(-15, -3, -2, 1, 7, 14, 29, 30, 40, 50, 69, 234)),
                arguments(Collections.emptyList(), Collections.emptyList()),
                arguments(Collections.emptyList(), null)
        );
    }

    @ParameterizedTest
    @MethodSource("validPairList")
    void returnsFirstPairInTheList(List<Integer> expectedValues, List<Integer> valuesInput) {
        assertEquals(expectedValues, FirstPair.returnPairNumbers(valuesInput));
    }

    @Test
    void returnsNullBecauseThereAreNoPairs() {
        assertEquals(Collections.emptyList(), FirstPair.returnPairNumbers(asList(-3, -2, 0, 1, 4)));
    }

}