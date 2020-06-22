package br.com.fernando.sort;

import java.util.List;

public class Selection {

    private Selection(){
    }

    public static List<Integer> sort(List<Integer> numeros) {

        for (int j = 0; j < numeros.size(); j++) {

            int smallerNumberIndex = j;

            for (int i = j + 1; i < numeros.size(); i++) {
                if (numeros.get(i) < numeros.get(smallerNumberIndex)) smallerNumberIndex = i;
            }

            if (smallerNumberIndex != j) {
                int firstJIndexValue = numeros.get(j);

                numeros.set(j, numeros.get(smallerNumberIndex));
                numeros.set(smallerNumberIndex, firstJIndexValue);
            }
        }

        return numeros;
    }

}
