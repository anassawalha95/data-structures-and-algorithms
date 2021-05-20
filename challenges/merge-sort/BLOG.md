# Merge Sort

**Merge sort:** is a Divide and Conquer algorithm.the algorithem does split the array recusively into two parts (left,right) from top to bottom. the conquer happens when the array is sorted and merged togather from bottom to top.

### Time and complexity

Merge sort complexity has O( n log n) in its worst case where it has to divid the array every time then loop over the values for comparison. While the space has O(n)

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
