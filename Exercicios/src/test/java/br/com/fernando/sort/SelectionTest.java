package br.com.fernando.sort;

import org.junit.jupiter.api.Test;

import static br.com.fernando.sort.Selection.sort;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionTest {

    @Test
    public void validaRetornoOrdenado() {

        assertEquals(asList(1, 1, 2, 2, 3, 5, 5, 100, 732), sort(asList(100, 2, 1, 3, 5, 1, 2, 5, 732)));

    }

}