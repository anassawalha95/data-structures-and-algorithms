# Quick Sort

**Quick sort:** is a Divide and Conquer algorithm.
The algorithem work by choosing an element from the list, called a pivot. The pivot is used to divide the list into two sub-lists. Reorder all the elements around the pivot, so that the smaller values are placed before it, and the larger values are placed after it. Once all this occurs, the pivot is in its final position. Then, the above steps are applied recursively to both sub-lists on the right and left of the pivot.

### Time and complexity

Quick sort complexity has O(log n) in its best case but the best case cant be reached because its unknown the worst case is O(n^2). While the space has the worst of O(n) and the best is O(logn)

### Algorithm

1. Declare an algorithm called QuickSort that accepts an array, index left, and index right

   1. check if the left index is less than the right index.
   2. define a position variable that holds the returend value of a method that called a partition where it takes the array, the left, and the right indexes.
   3. call the the QuickSort method recursivly by sending the array with left index and the position minus one
   4. call the the QuickSort method recursivly by sending the array with position plus one and the right index
   5. return the array

2. Declare an algorithm called Partition that accepts an array, index left, and index right

   1. define a variable called piovt and assign the value of the array of the right index
   2. define a variable called low and set it equal to left index minus one
   3. loop while the starting index equal to the left and the ending index equals to be less the right index
   4. check if the value of the array for the counter index is less than or equal to the pivot value
   5. if so increase the low variable by one then call a method swap for the array, counter and the low variable to swap the values
   6. after the loop is done call the swap function again and pass the array, right ,and the low variables to the method
   7. return the low variable increased by one

3. Declare an algorithm called Swap that accepts an array, index i, and index low

   1. define temp variable and set it to the value of the array for the index i
   2. set the value of the array of the index i to be equal to the value of the array of the index low
   3. then set the value of the array of the index low equal to the temp value
   4. return the array

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
