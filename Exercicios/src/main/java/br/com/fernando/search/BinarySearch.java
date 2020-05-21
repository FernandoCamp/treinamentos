package br.com.fernando.search;

import java.util.List;

public class BinarySearch {

    public String binarySearch(List<String> sortedArray, String expectedValue) {

        int leftPointer = 0;
        int rightPointer = sortedArray.size();

        while (leftPointer < rightPointer) {
            int middlePointer = Math.floorDiv(leftPointer + rightPointer, 2);

            final String middleElement = sortedArray.get(middlePointer);

//            if (middleElement.compareTo())

            return "-1";
        }

        return "-1";
    }

}
