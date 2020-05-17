package br.com.fernando.windowpattern;

import java.util.List;

public class SubarraySum {

    private SubarraySum() {
    }

    public static Integer maxSubarraySum(List<Integer> numbers, Integer sequenceOfNumbers) {
        return operationSubarraySum(numbers, sequenceOfNumbers, Math::max);
    }

    public static Integer minSubarraySum(List<Integer> numbers, int sequenceOfNumbers) {
        return operationSubarraySum(numbers, sequenceOfNumbers, Math::min);
    }

    public static int sumFirstNNumbers(List<Integer> numbers, Integer amountOfSummedNumbers) {
        int sum = 0;
        for (int i = 0; i < amountOfSummedNumbers; i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

    public static Integer operationSubarraySum(List<Integer> numbers, int sequenceOfNumbers, Operation operation) {
        int sum = sumFirstNNumbers(numbers, sequenceOfNumbers);
        int tempSum = sum;

        for (int i = 0; i < numbers.size() - sequenceOfNumbers; i++) {
            tempSum = tempSum - numbers.get(i) + numbers.get(i + sequenceOfNumbers);
            sum = operation.expectedValues(sum, tempSum);
        }

        return sum;
    }

    private interface Operation {
        int expectedValues(int a, int b);
    }

}
