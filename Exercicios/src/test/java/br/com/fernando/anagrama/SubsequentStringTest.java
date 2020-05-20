package br.com.fernando.anagrama;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static br.com.fernando.anagrama.SubsequentString.isSubsequent;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubsequentStringTest {

    static Stream<Arguments> subsequentTests() {
        return Stream.of(
                arguments("hello", "hello world", true),
                arguments("sing", "sting", true),
                arguments("abc", "abracadabra", true),
                arguments("abc", "acb", false),
                arguments("cachorro", "cuanctos hamsters roedorres oh", true)
        );
    }

    @ParameterizedTest
    @MethodSource("subsequentTests")
    void isSubsequentTest(String firstString, String secondString, boolean isSubsequent) {
        assertEquals(isSubsequent, isSubsequent(firstString, secondString));
    }
}