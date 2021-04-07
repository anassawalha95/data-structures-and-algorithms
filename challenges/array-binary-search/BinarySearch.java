package arraybinarysearch;
import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearch {

   public static int binarySearch (int[] arr, int searchKey){
        int arrLength=arr.length;
      //  int lastIndex=arrLength-1;
        int firstIndex=0;
        int  middleElementIndex=arrLength/ 2;
        System.out.println(Arrays.toString(arr));
        if(arrLength % 2==0){ // check if the array is odd or even
            System.out.println( "prosition "+middleElementIndex);
            if(arr[middleElementIndex] == searchKey &&  arrLength == 1){
                System.out.println(arr[middleElementIndex]+"even block");
                return middleElementIndex;
            }else if(arrLength == 1 ){
                return -1;
            }
            else if(searchKey > arr[middleElementIndex]  ){
//
                return  binarySearch(Arrays.copyOfRange(arr, middleElementIndex--, arrLength), searchKey)+middleElementIndex;
            }
            else if(searchKey < arr[ middleElementIndex]  ){
              //  System.out.println(Arrays.toString(Arrays.copyOfRange(arr, firstIndex, middleElementIndex)));
                return  binarySearch(Arrays.copyOfRange(arr, firstIndex, middleElementIndex), searchKey)-middleElementIndex;
            }




        }

        else {
            System.out.println( "prosition "+middleElementIndex);
            if(arr[middleElementIndex] == searchKey  && arrLength == 1){
                System.out.println(arr[middleElementIndex]+"odd block");
                return middleElementIndex;
            }else if(arrLength == 1  ){
                return -1;
            }
            else if(searchKey >arr[middleElementIndex]  ){
                //System.out.println( "prosition"+middleElementIndex);
                return binarySearch(Arrays.copyOfRange(arr, middleElementIndex++, arrLength), searchKey)+middleElementIndex;
            }
            else if(searchKey < arr[middleElementIndex]  ){
                return  binarySearch(Arrays.copyOfRange(arr, firstIndex, middleElementIndex), searchKey)-middleElementIndex;
            }

        }
        return -1;


    }

 public static void main(String[] args) {


        int [] arr ={1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
    
        System.out.println(binarySearch(arr, 28));
    }
}
