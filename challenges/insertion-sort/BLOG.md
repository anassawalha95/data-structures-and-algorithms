
# Insertion Sort 

**Insertion sort:** is a simple sorting algorithm that finds the smallest number then add it at the beginning like sorting money based on its denomination

### Time and complexity 

Insertion sort complexity has O(n^2) in its worst case where it has to check for each single item value. While the space has O(1) because it does the manipulation on the same array 


### Algorithm
1. Work left to right
2. Examine each item and compare that item to items on its left.
3. Insert the item in the correct position in the array.


### Pesudo Code 

     InsertionSort(int[] arr)
     
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp



### Diagram 



![linked list 3](https://github.com/anassawalha95/data-structures-and-algorithms/blob/main/assests/insertion-sort.png)
