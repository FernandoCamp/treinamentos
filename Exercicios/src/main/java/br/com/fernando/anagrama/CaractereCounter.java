package br.com.fernando.anagrama;

import java.util.HashMap;
import java.util.Map;

public class CaractereCounter {

    private CaractereCounter() {
    }

    public static Map<Character, Integer> countsEachCaractereOfWord(String palavra) {
        var caracteresPalavra = new HashMap<Character, Integer>();
        for (char caractere : palavra.toCharArray()) {
            caracteresPalavra.merge(caractere, 1, Integer::sum);
        }
        return caracteresPalavra;
    }

    public static boolean checkDuplicates(Object... arguments) {
        StringBuilder argumentsAsString = new StringBuilder();
        for (Object argument : arguments) {
            argumentsAsString.append(argument.toString());
        }
        return countsEachCaractereOfWord(argumentsAsString.toString())
                .values()
                .stream()
                .anyMatch(amount -> amount != 1);
    }

}