package br.com.fernando.multiplepointers;

import java.util.List;

public class AveragePair {

    private AveragePair() {
    }

    public static boolean avaragePair(List<Integer> numbers, float average) {

        int rightPointer = numbers.size() - 1;
        int leftPointer = 0;
        while (leftPointer < rightPointer) {
            float divisionResult = (float) (numbers.get(leftPointer) + numbers.get(rightPointer)) / 2;
            if (divisionResult == average) {
                return true;
            } else if (divisionResult > average) {
                rightPointer -= 1;
                continue;
            }
            leftPointer++;
        }

        return false;
    }

}
