package br.com.fernando.anagrama;

public class Anagram {

    private Anagram() {
    }

    public static boolean verifyAnagram(String primeiraPalavra, String segundaPalavra) {

        if (primeiraPalavra.length() != segundaPalavra.length()) return false;

        var caracteresComSuasQuantidades = CaractereCounter.countsEachCaractereOfWord(primeiraPalavra);

        for (char caractere : segundaPalavra.toCharArray()) {
            caracteresComSuasQuantidades.merge(caractere, -1, Integer::sum);
        }

        return caracteresComSuasQuantidades.entrySet().stream().noneMatch(caractere -> caractere.getValue() != 0);
    }

    public static boolean verifyAnagram(String primeiraPalavra, String segundaPalavra, boolean caseSensitive) {
        if (caseSensitive) return verifyAnagram(primeiraPalavra, segundaPalavra);
        return verifyAnagram(primeiraPalavra.toUpperCase(), segundaPalavra.toUpperCase());
    }

    public static boolean sameFrequency(Integer a, Integer b) {
        return verifyAnagram(a.toString(), b.toString());
    }

}
