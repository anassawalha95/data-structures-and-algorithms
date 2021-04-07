package arraybinarysearch;
import java.util.Arrays;
import java.util.ArrayList;

public class testBinarySearch {
    
 @Test public void testBinarySearch() {
        int[] test1=  {4,8,15,16,23,42}; 
         int[] test2=  {11,22,33,44,55,66,77};
         int[] test3=  {1, 2, 3, 5, 6, 7};
         int[] expect1 ={2};
         int[] expect2 ={-1};
         int[] expect3 ={-1};
        

   

        assertArrayEquals("test expect output is "+expect1,expect1,BinarySearch.insertShiftArray(test1,15));
        assertArrayEquals("test expect output is "+expect2,expect2,BinarySearch.insertShiftArray(test2,90));
        assertArrayEquals("test expect output is "+expect2,expect3,BinarySearch.insertShiftArray(test3, 4));
    }


}
