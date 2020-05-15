package br.com.fernando;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static br.com.fernando.ContadorCaracteres.contabilizaCadaCaractereDaPalavra;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContadorCaracteresTest {

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
        assertEquals(valorEsperado, contabilizaCadaCaractereDaPalavra(palavra).get(caractereSelecionado));
    }

}
