package arraybinarysearch;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
public class testBinarySearch {
    @Test
    public void binarySearchSolution1Test(){
        int [] arr ={1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,70};
                  // 0,1,2,3,4 ,5 ,6 ,7 ,8 ,9 ,10,11,12,13,14,15,16


        System.out.println("The Index is: "+ binarySearch.binarySearchSolution1(arr, 43));
        
        
        System.out.println("The Index is: "+ binarySearch.binarySearchSolution2(arr, 43));

        assertEquals(13,binarySearch.binarySearchSolution1(arr, 43));
        assertEquals(13,binarySearch.binarySearchSolution2(arr, 43));


        assertEquals(16,binarySearch.binarySearchSolution1(arr, 70));
        assertEquals(16,binarySearch.binarySearchSolution2(arr, 70));

        assertEquals(0,binarySearch.binarySearchSolution1(arr, 1));
        assertEquals(0,binarySearch.binarySearchSolution2(arr, 1));
        
    }


}
