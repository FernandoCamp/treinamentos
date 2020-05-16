package br.com.fernando.multiplepointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstPair {

    private FirstPair() {
    }

    public static List<Integer> returnPairNumbers(List<Integer> numbers) {
        if (numbers == null) return Collections.emptyList();

        int leftPointer = 0;
        int rightPointer = numbers.size() - 1;

        while (leftPointer < rightPointer) {

            int leftPointerValue = numbers.get(leftPointer);
            int rightPointerValue = numbers.get(rightPointer);

            if (leftPointerValue + rightPointerValue == 0) {
                return Arrays.asList(leftPointerValue, rightPointerValue);
            }

            int leftAndRightValuesComparison = Integer.compare(leftPointerValue * -1, rightPointerValue);

            if (leftAndRightValuesComparison > 0) {
                leftPointer++;
            } else if (leftAndRightValuesComparison < 0) {
                rightPointer--;
            }
        }
        return Collections.emptyList();
    }

}
