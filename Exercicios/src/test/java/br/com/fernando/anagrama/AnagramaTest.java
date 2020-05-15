package br.com.fernando.anagrama;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {

    @Test
    void testaAnagramaSemSucesso() {
        assertFalse(Anagrama.verificaAnagrama("Pandora", "Leopoldo"));
    }

    @Test
    void testaAnagramaComSucesso() {
        assertTrue(Anagrama.verificaAnagrama("Pandora", "Parodna"));
    }

    @Test
    void testaAnagramaSucessoSemCaseSensitive() {
        assertTrue(Anagrama.verificaAnagrama("Kimberly", "berlykim", false));
    }

    @Test
    void testaAnagramaSucessoComCaseSensitive() {
        assertFalse(Anagrama.verificaAnagrama("panDora", "parodna", true));
    }

    @Test
    void testaAnagramaComFalha() {
        assertFalse(Anagrama.verificaAnagrama("Panda", "Pand", true));
        assertFalse(Anagrama.verificaAnagrama("Pand", "Panda", true));
    }

    @Test
    void testParaStringsVazias() {
        assertTrue(Anagrama.verificaAnagrama("", ""));
    }

}