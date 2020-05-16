package br.com.fernando.multiplepointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UniqueValues {

    public static List<Integer> returnUniqueValues(List<Integer> values) {
        int i = 0;
        List<Integer> uniqueValues = new ArrayList<>();
        for (int j = 1; j <= values.size(); j++) {
            if (!values.get(j).equals(values.get(i))) {
                uniqueValues.add(values.get(i ++));
            }
        }
        return uniqueValues;
    }

}
