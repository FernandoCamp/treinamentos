package br.com.fernando.sort;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    private static List<String> sort(List<String> words, int repeticoes) {

        if (words.size() <= 1) return words;

        boolean repetir = false;

        for (int i = 0; i < words.size() - 1 - repeticoes; i++) {
            final var currentWord = words.get(i);
            final var nextWord = words.get(i + 1);

            if (currentWord.compareTo(nextWord) >= 1) {
                swapCurrentIndexForNext(words, i);
                repetir = true;
            }

        }

        if (repetir) sort(words, ++repeticoes);

        return words;
    }

    public static List<String> sort(List<String> words) {
        return sort(words, 0);
    }

    private static void swapCurrentIndexForNext(List<String> words, int currentIndex) {
        final var currentIndexWord = words.get(currentIndex);

        words.set(currentIndex, words.get(currentIndex + 1));
        words.set(currentIndex + 1, currentIndexWord);
    }

    public static void main(String[] args) {
        sort(Arrays.asList("Fernando", "Cristhinne", "Vira Lata"));
    }

}
