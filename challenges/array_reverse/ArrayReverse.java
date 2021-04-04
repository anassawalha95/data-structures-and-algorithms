
import java.util.Arrays;

public class ArrayReverse {

public static int[] reverseArray (int[] arr){
   int counter=0; 
   int[] reversedArray =  new int[arr.length];
   for(int index=arr.length-1; index >=0 ; --index)
   {
       reversedArray[index]=arr[counter];
        counter++;
   }

    System.out.println(Arrays.toString(reversedArray));


    return reversedArray;
}

// main method

    public static void main(String[] args) {
        
    int[] arr=  {1, 2, 3, 4, 5, 6};
  
      reverseArray(arr);

    }
}
