package blog;

import java.util.Arrays;

public
class MergeSort {


    public static int[] MergeSort(int[] arr) {

        int n = arr.length;

        if (n > 1) {
            int mid = (int) Math.ceil((double) n / 2.0);

            int[] left =Arrays.copyOfRange(arr, 0, mid);
            int[] right=Arrays.copyOfRange(arr, mid, n);
            // sort the left side
            left= MergeSort(left);
            // sort the right side
            right= MergeSort(right);
            // merge the sorted left and right sides together
            arr=  Merge(left, right, arr);
        }
        return arr;
    }

    public static  int[] Merge(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while( i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;

        }

        if( i == left.length)
            for(int index = j ; index < right.length ; index++){
                arr[k] =  right[index];
                k++;
            }
        else
            for(int index = i ; index < left.length ; index++){
                arr[k] =  left[index];
                k++;
            }

    return arr;

    }

    public static void main(String[] args)    {

        int[] a1={8,4,23,42,16,15};
        int[] a2={5,12,7,5,5,7};
        int[] a3={2,3,5,7,13,11};

        System.out.println(Arrays.toString(MergeSort(a1)));
        System.out.println(Arrays.toString(MergeSort(a2)));
        System.out.println(Arrays.toString(MergeSort(a3)));
    }
}
