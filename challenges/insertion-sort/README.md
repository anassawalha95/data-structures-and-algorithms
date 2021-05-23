# Insertion Sort

**Insertion sort:** is a simple sorting algorithm that finds the smallest number then add it at the beginning like sorting money based on its denomination

### Time and complexity

Insertion sort complexity has O(n^2) in its worst case where it has to check for each single item value. While the space has O(1) because it does the manipulation on the same array

### Algorithm

1. Create an algorithim called InsertionSort that accept an array of integars
2. check of the array length if its zero or one return the array
3. loop through the array items
4. create a temp variable that holds the the previous index
5. create a temp variable that holds the value of the current index value
6. loop on the previous index while the indx greater than or equal to zero and the value of the temp variable is less than the value of the previous index
7. swap by set the array value of the previous index plus one to array value of the previous index
8. after the loop set the array value of the previous index plus one to be equal to the temp value
9. repeat until the array is sorted
10. return the new array

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
