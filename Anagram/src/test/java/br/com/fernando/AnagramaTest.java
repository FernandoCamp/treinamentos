package br.com.fernando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {

    void verificaSeEhAnagrama() {
        var nome = Anagrama.contabilizaCadaCaractereDaPalavra("Leopoldo");

        assertEquals(1, nome.get('l'));
        assertEquals(3, nome.get('o'));
        assertEquals(1, nome.get('e'));
        assertNull(nome.get('c'));
    }

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