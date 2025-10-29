package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer[][] arrays = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Original Array " + (i + 1) + ": " + Arrays.toString(arrays[i]));
            Integer[] sorted = BubbleSort.sort(arrays[i]);
            System.out.println("Sorted Array " + (i + 1) + ":   " + Arrays.toString(sorted));
            System.out.println();
        }
    }
}
