package br.com.fernando.anagrama;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static br.com.fernando.anagrama.CaractereCounter.checkDuplicates;
import static br.com.fernando.anagrama.CaractereCounter.countsEachCaractereOfWord;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CaractereCounterTest {

    static Stream<Arguments> parametrosDeContabilizacaoDePalavras() {
        final String palavra = "Leopoldo";
        return Stream.of(
                arguments(1, 'l', palavra),
                arguments(3, 'o', palavra),
                arguments(1, 'e', palavra)
        );
    }

    @ParameterizedTest(name = "Esperando {0} caractere(s) \"{1}\" na palavra {2}")
    @MethodSource("parametrosDeContabilizacaoDePalavras")
    void verificaSeEhAnagrama(int valorEsperado, Character caractereSelecionado, String palavra) {
        assertEquals(valorEsperado, countsEachCaractereOfWord(palavra).get(caractereSelecionado));
    }

    @Test
    void duplicates() {
        assertFalse(checkDuplicates(1, 2, 3));
        assertTrue(checkDuplicates(1, 2, 2));
        assertTrue(checkDuplicates('a', 'b', 'c', 'a'));
    }

}
