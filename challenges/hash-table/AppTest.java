package blog;

import org.junit.Test;
import org.junit.*;

import blog.InsertionSort;
import blog.MergeSort;

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

    @Test public void MergeSortTest() {

        int[] a1={8,4,23,42,16,15};
        int[] a2={5,12,7,5,5,7};
        int[] a3={2,3,5,7,13,11};


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},MergeSort.MergeSort(a1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},MergeSort.MergeSort(a2));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},MergeSort.MergeSort(a3));

    }
    @Test public void QuickSortTest() {

        int[] a1={8,4,23,42,16,15};
        int[] a2={5,12,7,5,5,7};
        int[] a3={2,3,5,7,13,11};


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},QuickSort.QuickSort(a1,0,a1.length-1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},QuickSort.QuickSort(a2,0,a2.length-1));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},QuickSort.QuickSort(a3,0,a3.length-1));

    }
}