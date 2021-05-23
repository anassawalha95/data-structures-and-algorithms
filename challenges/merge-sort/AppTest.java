package blog;

import org.junit.Test;
import org.junit.*;

import blog.MergeSort;

import static org.junit.Assert.*;

public class AppTest {

  
 @Test public void MergeSortTest() {

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


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},MergeSort.MergeSort(test1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},MergeSort.MergeSort(test2));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},MergeSort.MergeSort(test3));
        assertArrayEquals(new int[]{-85, -44, -35, -10, 10, 20},MergeSort.MergeSort(test4));
        assertArrayEquals(new int[]{ },MergeSort.MergeSort(test5));
        assertArrayEquals(new int[]{1},MergeSort.MergeSort(test6));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},MergeSort.MergeSort(test7));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},MergeSort.MergeSort(test8));
        assertArrayEquals(new int[]{-11, -7, -4, 2, 5, 13},MergeSort.MergeSort(test9));
        assertArrayEquals(new int[]{2, 2, 2, 3, 5, 7, 7, 11, 13, 13, 13},MergeSort.MergeSort(test10));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7},MergeSort.MergeSort(test11));
        assertArrayEquals(new int[]{77, 77, 88, 88, 99, 99},MergeSort.MergeSort(test12));

    }
}