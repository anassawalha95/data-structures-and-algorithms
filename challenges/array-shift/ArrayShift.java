package arrayshift;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayShift {

 public static int[] insertShiftArray (int[] arr,int value){
        ArrayList<Integer> newArray =new ArrayList<>();
        for (int i = 0; i< arr.length;++i){
            if(Math.floor(arr.length/2) == i && arr.length % 2==0) {
                newArray.add(value);
                newArray.add(arr[i]);
                continue;
            }
            if(Math.floor(arr.length/2) == i && arr.length % 2==1) {
                newArray.add(arr[i]);
                newArray.add(value);
                continue;

            }
            newArray.add(arr[i]);
        }

        int[] convertArray=new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++)
            convertArray[i] = newArray.get(i);
        return convertArray ;
    }


}
