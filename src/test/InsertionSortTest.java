package test;

import models.PerformanceTracker;
import models.insertionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class InsertionSortTest {
    @Test
    void testEmptyArray() {
        int[] arr = {};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {1};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testNearlySorted() {
        int[] arr = {1, 2, 4, 3, 5, 6};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {3, 2, 3, 1, 3};
        insertionSort.sort(arr, new PerformanceTracker());
        assertArrayEquals(new int[]{1, 2, 3, 3, 3}, arr);
    }
}
