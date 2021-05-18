# Quick Sort

**Quick sort:** is a Divide and Conquer algorithm.
The algorithem work by choosing an element from the list, called a pivot. The pivot is used to divide the list into two sub-lists. Reorder all the elements around the pivot, so that the smaller values are placed before it, and the larger values are placed after it. Once all this occurs, the pivot is in its final position. Then, the above steps are applied recursively to both sub-lists on the right and left of the pivot.

### Time and complexity

Merge sort complexity has O(log n) in its best case but the best case cant be reached because its unknown the worst case is O(n^2). While the space has the worst of O(n) and the best is O(logn)

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

![quick-sort](https://github.com/anassawalha95/data-structures-and-algorithms/blob/main/assests/quick-sort.jpg)
