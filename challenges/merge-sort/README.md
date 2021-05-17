
# Merge Sort 

**Merge sort:** is a simple sorting algorithm that finds the smallest number then add it at the beginning like sorting money based on its denomination

### Time and complexity 

Insertion sort complexity has O(n^2) in its worst case where it has to check for each single item value. While the space has O(1) because it does the manipulation on the same array 


### Algorithm
1. Work left to right
2. Examine each item and compare that item to items on its left.
3. Insert the item in the correct position in the array.


### Pesudo Code 

ALGORITHM Mergesort(arr)
  	  DECLARE n <-- arr.length
           
    	if n > 1
   	   DECLARE mid <-- n/2
    	  DECLARE left <-- arr[0...mid]
    	  DECLARE right <-- arr[mid...n]
    	  // sort the left side
    	  Mergesort(left)
    	  // sort the right side
    	  Mergesort(right)
    	  // merge the sorted left and right sides together
    	  Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left



### Diagram 



![merge-sort](https://github.com/anassawalha95/data-structures-and-algorithms/blob/main/assests/merge-sort.png)