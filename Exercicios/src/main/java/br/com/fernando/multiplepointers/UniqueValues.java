package br.com.fernando.multiplepointers;

import java.util.ArrayList;
import java.util.List;

public class UniqueValues {

    private UniqueValues() {
    }

    public static List<Integer> returnUniqueValuesInOrderedList(List<Integer> values) {
        List<Integer> uniqueValues = new ArrayList<>();
        for (Integer value : values) {
            if (uniqueValues.isEmpty() || !value.equals(uniqueValues.get(uniqueValues.size() - 1))) {
                uniqueValues.add(value);
            }
        }
        return uniqueValues;
    }

}
