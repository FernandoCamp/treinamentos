package br.com.fernando.search;

import java.util.List;

public class LinearSearch {

    public static int linearSearch(List<Integer> elements, int desiredValue) {

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(desiredValue)) return i;
        }

        return -1;
    }

}
