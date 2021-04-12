package arraybinarysearch;
import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearch {



    public static int binarySearchSolution1 (int[] arr, int searchKey){
        int arrLength=arr.length;
        int firstIndex=0;
        int  middleElementIndex=arrLength/ 2;
        boolean flag= false;
        int addOne=0;
        if (firstIndex<=arrLength) {
            if (arr[middleElementIndex] == searchKey) {
                flag=true;
                System.out.println(Arrays.toString(arr));
                System.out.println("+"+middleElementIndex);
                System.out.println("---------");
                return middleElementIndex;


            } else if (searchKey > arr[middleElementIndex]) {

                if (flag && arrLength == 2 || arrLength == 1 ){
                    addOne+=1;

                }

                System.out.println(Arrays.toString(arr));
                System.out.println("+"+middleElementIndex);
                System.out.println("---------");

                return binarySearchSolution1(Arrays.copyOfRange(arr, middleElementIndex, arrLength), searchKey) + middleElementIndex+addOne;
            } else if (searchKey < arr[middleElementIndex]) {
                if (!flag && arrLength == 2 || arrLength == 1 ){
                    addOne+=1;
                }

                System.out.println(Arrays.toString(arr));
                System.out.println("-"+middleElementIndex);
                System.out.println("---------");
                return binarySearchSolution1(Arrays.copyOfRange(arr, firstIndex, middleElementIndex+1), searchKey) - middleElementIndex+addOne;
            }

        }
        return -1;


    }

    public static int binarySearchSolution2 (int[] recivedArray, int searchKey){
        int start=0;
        int end=recivedArray.length-1;
        int middle=recivedArray.length/2;
        int tempStart=0;
        int tempEnd=0;


        while(start<=end){

            if (recivedArray[middle] == searchKey ){
                    return middle;
            }

            if (searchKey > recivedArray[middle]){
                tempStart=middle;
                middle=  ((end - start)/2) +start;
                start=tempStart+1;

            }

            if (searchKey < recivedArray[middle]){
                tempEnd=middle;
                middle=((end -  start)/2) + start  ;
                end=tempEnd- 1;

            }


        }

        return -1;


    }

    public static void main(String[] args) {


        int [] arr ={1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,70};
                  // 0,1,2,3,4 ,5 ,6 ,7 ,8 ,9 ,10,11,12,13,14,15,16


        System.out.println("The Index is: "+ binarySearchSolution1(arr, 43));
    }

}
