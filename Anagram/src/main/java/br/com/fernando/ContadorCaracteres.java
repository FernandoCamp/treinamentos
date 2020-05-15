package br.com.fernando;

import java.util.HashMap;
import java.util.Map;

public class ContadorCaracteres {

    private ContadorCaracteres() {
    }

    public static Map<Character, Integer> contabilizaCadaCaractereDaPalavra(String palavra) {
        var caracteresPalavra = new HashMap<Character, Integer>();
        for (char caractere : palavra.toCharArray()) {
            caracteresPalavra.merge(caractere, 1, Integer::sum);
        }
        return caracteresPalavra;
    }
}