package blog;

import org.junit.Test;
import org.junit.*;

import blog.InsertionSort;

import static org.junit.Assert.*;

public class AppTest {

    @Test public void insertionSortTest() {

        int[] a1={8,4,23,42,16,15};
        int[] a2={5,12,7,5,5,7};
        int[] a3={2,3,5,7,13,11};


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},InsertionSort.insertionSort(a1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},InsertionSort.insertionSort(a2));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},InsertionSort.insertionSort(a3));
        
    }
}