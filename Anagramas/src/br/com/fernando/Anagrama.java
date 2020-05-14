package br.com.fernando;

import java.util.HashMap;
import java.util.Map;

public class Anagrama {

    private Anagrama() {
    }

    public static boolean verificaAnagrama(String primeiraPalavra, String segundaPalavra) {

        var caracteresComSuasQuantidades = contabilizaCadaCaractereDaPalavra(primeiraPalavra);

        for (char caractere : segundaPalavra.toCharArray()) {
            caracteresComSuasQuantidades.merge(caractere, -1, Integer::sum);
        }

        return caracteresComSuasQuantidades.entrySet().stream().noneMatch(caractere -> caractere.getValue() != 0);
    }

    public static boolean verificaAnagrama(String primeiraPalavra, String segundaPalavra, boolean caseSensitive) {
        if (caseSensitive) return verificaAnagrama(primeiraPalavra, segundaPalavra);
        return verificaAnagrama(primeiraPalavra.toUpperCase(), segundaPalavra.toUpperCase());
    }

    public static Map<Character, Integer> contabilizaCadaCaractereDaPalavra(String palavra) {
        var caracteresPalavra = new HashMap<Character, Integer>();
        for (char caractere : palavra.toCharArray()) {
            caracteresPalavra.merge(caractere, 1, Integer::sum);
        }
        return caracteresPalavra;
    }

}
