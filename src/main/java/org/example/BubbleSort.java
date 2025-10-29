package org.example;

public class BubbleSort {
    // Method to sort an array using Bubble Sort
    public static Integer[] sort(Integer[] arr) {
        boolean swapped;
        int n = arr.length;

        // Outer loop for passes
        do {
            swapped = false;

            // Compare adjacent elements
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap if elements are out of order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // After each pass, the largest element is at the end
            n--;

        } while (swapped);

        return arr;
    }
}
