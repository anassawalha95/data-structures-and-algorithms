# Merge Sort

**Merge sort:** is a Divide and Conquer algorithm.the algorithem does split the array recusively into two parts (left,right) from top to bottom. the conquer happens when the array is sorted and merged togather from bottom to top.

### Time and complexity

Merge sort complexity has O( n log n) in its worst case where it has to divid the array every time then loop over the values for comparison. While the space has O(n)

### Algorithm

1. Declare an algorithm called mergesort that accepts an array

   1. declare a variable called n that saves the incoming array length
   2. check if the array is greater than one
   3. declare array middle variable and set it equals to n divided by 2
   4. declare array left variable and set it to equal of array from the beggining to the middle
   5. declare array right variable and set it to equal of array from the middle to the end
   6. call the algorithm mergesort for the left recursivly
   7. call the algorithm mergesort for the right recursivly
   8. call the algorithm merge for the left, right, and array recived
   9. return the array

2. Declare an algorithm called merge that accept array left, array right, and an array

   1. declare a i, j, and k variables and set it to zero
   2. loop unless i is less than the array left length and the j is less than the array right length
   3. check if the value of the left array for the index i is less than or equal the right array for the index j
   4. if so set the array of the index k equals to the value of the left array for the index i
   5. increase the i variable by one
   6. if not set the array of the index k equals to the value of the right array for the index j
   7. increase the j variable by one
   8. one we are of the check statment increase the index k by one
   9. check if the equals to array left length
   10. if so loop over the array right values and set them to array of k
   11. increse the value of k each time it loops
   12. otherwise loop over the array left values and set them to array of k
   13. increse the value of k each time it loops
   14. return the array

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
