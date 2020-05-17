package br.com.fernando.windowpattern;

import java.util.List;

public class SubarraySum {

    private SubarraySum() {
    }

    public static Integer maxSubarraySum(List<Integer> numbers, Integer sequencyOfNumbers) {
        int maxSum = sumFirstNNumbers(numbers, sequencyOfNumbers);
        int tempSum = maxSum;

        for (int i = 0; i < numbers.size() - sequencyOfNumbers; i++) {
            tempSum = tempSum - numbers.get(i) + numbers.get(i + sequencyOfNumbers);
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }

    public static int sumFirstNNumbers(List<Integer> numbers, Integer amountOfSummedNumbers) {
        int sum = 0;
        for (int i = 0; i < amountOfSummedNumbers; i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

}
