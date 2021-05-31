package com.company;

public class Main {
    //printing array function
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // array for all tests
        int arr [] = {64, 34, 25, 12, 22, 11, 90};
     // 1- test Bubble Sort Function
     BubbleSort b = new BubbleSort();
        b.BubbleSort(arr);
        System.out.println("Bubble Sorted array");
        printArray(arr);

// 2- test for   Selection Sort Algorithm
        SelectionSort s = new SelectionSort();
        s.SelectionSort(arr);
        System.out.println("Selection Sort  array");
        printArray(arr);

// 3- test for insertion Sort Algorithm
        insertionSort i = new insertionSort();
        i.insertionSort(arr);
        System.out.println("insertion Sort  array");
        printArray(arr);
/*
// 4 - test for merge Sort Algorithm
        mergeSort m = new mergeSort();
        m.mergeSort(arr);
                System.out.println("merge Sort  array");
        printArray(arr);


 */
//5- test for quick sort Algorithm
        QuickSort q = new QuickSort();
       q.sort(arr,0,arr.length-1);
        System.out.println("Quick Sort  array");
        printArray(arr);









    }
}
