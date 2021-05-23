package blog;

import org.junit.Test;
import org.junit.*;

import blog.InsertionSort;

import static org.junit.Assert.*;

public class AppTest {

    @Test public void insertionSortTest() {

      int[] test1={8,4,23,42,16,15};
        int[] test2={5,12,7,5,5,7};
        int[] test3={2,3,5,7,13,11};
        int[] test4={-10,-85,-35,-44,10,20};
        int[] test5={};
        int[] test6={1};
        int[] test7={1,2,3,4,5,6,7,8,9};
        int[] test8={9,8,7,6,5,4,3,2,1};
        int[] test9={2,-7,5,-4,13,-11};
        int[] test10={2,2,2,3,5,7,7,13,13,13,11};
        int[] test11={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7};
        int[] test12={99,99,77,77,88,88};


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},InsertionSort.insertionSort(test1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},InsertionSort.insertionSort(test2));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},InsertionSort.insertionSort(test3));
        assertArrayEquals(new int[]{-85, -44, -35, -10, 10, 20},InsertionSort.insertionSort(test4));
        assertArrayEquals(new int[]{},InsertionSort.insertionSort(test5));
        assertArrayEquals(new int[]{1},InsertionSort.insertionSort(test6));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},InsertionSort.insertionSort(test7));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},InsertionSort.insertionSort(test8));
        assertArrayEquals(new int[]{-11, -7, -4, 2, 5, 13},InsertionSort.insertionSort(test9));
        assertArrayEquals(new int[]{2, 2, 2, 3, 5, 7, 7, 11, 13, 13, 13},InsertionSort.insertionSort(test10));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7},InsertionSort.insertionSort(test11));
        assertArrayEquals(new int[]{77, 77, 88, 88, 99, 99},InsertionSort.insertionSort(test12));

        
    }
}