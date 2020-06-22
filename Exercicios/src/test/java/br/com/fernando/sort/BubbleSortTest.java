package br.com.fernando.sort;

import org.junit.jupiter.api.Test;

import static br.com.fernando.sort.BubbleSort.sort;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void verifySimpleList() {
        assertEquals(asList("Cristhinne", "Fernando", "Vira lata"),
                     sort(asList("Vira lata", "Fernando", "Cristhinne")));
    }

    @Test
    void verifyBiggerList() {
        assertEquals(asList("Cristhinne", "Fernando", "Gordorians", "Kimberly", "Leopoldo", "Vira lata"),
                     sort(asList("Vira lata", "Fernando", "Cristhinne", "Leopoldo", "Gordorians", "Kimberly")));
    }

}