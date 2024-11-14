package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class Countsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        int[] sortedData = countSort(arr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(sortedData));
        
        sc.close();
    }

    private static int[] countSort(int[] arr) {
        int max = findMax(arr);
        int[] counter = new int[max + 1];

        // Count occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        System.out.println("Counter array: ");
        System.out.println(Arrays.toString(counter));

        // Cumulative sum
        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }
        
        System.out.println("Cumulative sum array: ");
        System.out.println(Arrays.toString(counter));
        
        int[] output = new int[arr.length];
        
        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[counter[arr[i]] - 1] = arr[i];
            counter[arr[i]]--;
        }
        
        return output;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}