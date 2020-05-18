package br.com.fernando.anagrama;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testaAnagramaSemSucesso() {
        assertFalse(Anagram.verifyAnagram("Pandora", "Leopoldo"));
    }

    @Test
    void testaAnagramaComSucesso() {
        assertTrue(Anagram.verifyAnagram("Pandora", "Parodna"));
    }

    @Test
    void testaAnagramaSucessoSemCaseSensitive() {
        assertTrue(Anagram.verifyAnagram("Kimberly", "berlykim", false));
    }

    @Test
    void testaAnagramaSucessoComCaseSensitive() {
        assertFalse(Anagram.verifyAnagram("panDora", "parodna", true));
    }

    @Test
    void testaAnagramaComFalha() {
        assertFalse(Anagram.verifyAnagram("Panda", "Pand", true));
        assertFalse(Anagram.verifyAnagram("Pand", "Panda", true));
    }

    @Test
    void testParaStringsVazias() {
        assertTrue(Anagram.verifyAnagram("", ""));
    }

    @Test
    void isSameFrequency() {
        assertTrue(Anagram.sameFrequency(215, 251));
        assertTrue(Anagram.sameFrequency(312, 123));
        assertFalse(Anagram.sameFrequency(111, 222));
    }

}