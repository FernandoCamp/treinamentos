package br.com.fernando.multiplepointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static br.com.fernando.multiplepointers.AveragePair.avaragePair;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class AveragePairTest {

    @Test
    void testingAveragePairs() {
        assertTrue(avaragePair(asList(1, 2, 3), 2.5f));
    }
    @Test
    void testingAveragePairs2() {
        assertTrue(avaragePair(asList(1, 3, 3, 5, 6, 7, 10, 12, 19), 8f));
    }
    @Test
    void testingAverageFalsePairs() {
        assertFalse(avaragePair(asList(-1, 0, 3, 4, 5, 6), 4.1f));
        assertFalse(avaragePair(Collections.emptyList(), 4f));
    }

}