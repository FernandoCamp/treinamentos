package br.com.fernando.anagrama;

public class Anagrama {

    private Anagrama() {
    }

    public static boolean verificaAnagrama(String primeiraPalavra, String segundaPalavra) {

        if (primeiraPalavra.length() != segundaPalavra.length()) return false;

        var caracteresComSuasQuantidades = ContadorCaracteres.contabilizaCadaCaractereDaPalavra(primeiraPalavra);

        for (char caractere : segundaPalavra.toCharArray()) {
            caracteresComSuasQuantidades.merge(caractere, -1, Integer::sum);
        }

        return caracteresComSuasQuantidades.entrySet().stream().noneMatch(caractere -> caractere.getValue() != 0);
    }

    public static boolean verificaAnagrama(String primeiraPalavra, String segundaPalavra, boolean caseSensitive) {
        if (caseSensitive) return verificaAnagrama(primeiraPalavra, segundaPalavra);
        return verificaAnagrama(primeiraPalavra.toUpperCase(), segundaPalavra.toUpperCase());
    }

}
