package br.com.fernando.anagrama;

public class SubsequentString {

    private SubsequentString() {
    }

    public static boolean isSubsequent(String firstWord, String secondWord) {

        char[] firstWordCharArray = firstWord.toCharArray();
        char[] secondWordCharArray = secondWord.toCharArray();

        int i = 0;

        for (int j = 0; j <= secondWord.length() - 1; j++) {
            char firstWordCharacter = firstWordCharArray[i];
            char secondWordCharacter = secondWordCharArray[j];

            if (firstWordCharacter == secondWordCharacter) {
                if (i == firstWord.length() - 1) return true;
                i++;
            }
        }
        return false;

    }

}
