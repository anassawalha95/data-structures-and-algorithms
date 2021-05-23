package blog;

import org.junit.Test;
import org.junit.*;

import blog.QuickSort;

import static org.junit.Assert.*;

public class AppTest {

  
       @Test public void QuickSortTest() {

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


        assertArrayEquals(new int[]{4, 8, 15, 16, 23, 42},QuickSort.QuickSort(test1,0,test1.length-1));
        assertArrayEquals(new int[]{5, 5, 5, 7, 7, 12},QuickSort.QuickSort(test2,0,test2.length-1));
        assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13},QuickSort.QuickSort(test3,0,test3.length-1));
        assertArrayEquals(new int[]{-85, -44, -35, -10, 10, 20},QuickSort.QuickSort(test4,0,test4.length-1));
        assertArrayEquals(new int[]{},QuickSort.QuickSort(test5,0,test5.length-1));
        assertArrayEquals(new int[]{1},QuickSort.QuickSort(test6,0,test6.length-1));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},QuickSort.QuickSort(test7,0,test7.length-1));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},QuickSort.QuickSort(test8,0,test8.length-1));
        assertArrayEquals(new int[]{-11, -7, -4, 2, 5, 13},QuickSort.QuickSort(test9,0,test9.length-1));
        assertArrayEquals(new int[]{2, 2, 2, 3, 5, 7, 7, 11, 13, 13, 13},QuickSort.QuickSort(test10,0,test10.length-1));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7},QuickSort.QuickSort(test11,0,test11.length-1));
        assertArrayEquals(new int[]{77, 77, 88, 88, 99, 99},QuickSort.QuickSort(test12,0,test12.length-1));


    }
}