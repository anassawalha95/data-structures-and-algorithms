# Quick Sort

**Quick sort:** is a Divide and Conquer algorithm.
The algorithem work by choosing an element from the list, called a pivot. The pivot is used to divide the list into two sub-lists. Reorder all the elements around the pivot, so that the smaller values are placed before it, and the larger values are placed after it. Once all this occurs, the pivot is in its final position. Then, the above steps are applied recursively to both sub-lists on the right and left of the pivot.

### Time and complexity

Merge sort complexity has O(log n) in its best case but the best case cant be reached because its unknown the worst case is O(n^2). While the space has the worst of O(n) and the best is O(logn)

### Pesudo Code

       ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)

      ALGORITHM Partition(arr, left, right)
          // set a pivot value as a point of reference
          DEFINE pivot <-- arr[right]
          // create a variable to track the largest index of numbers lower than the defined pivot
          DEFINE low <-- left - 1
          for i <- left to right do
              if arr[i] <= pivot
                  low++
                  Swap(arr, i, low)

           // place the value of the pivot location in the middle.
           // all numbers smaller than the pivot are on the left, larger on the right. 
           Swap(arr, right, low + 1)
          // return the pivot index point
           return low + 1

      ALGORITHM Swap(arr, i, low)
          DEFINE temp;
          temp <-- arr[i]
          arr[i] <-- arr[low]
          arr[low] <-- temp

### Diagram

![quick-sort](https://github.com/anassawalha95/data-structures-and-algorithms/blob/main/assests/quick-sort.jpg)
