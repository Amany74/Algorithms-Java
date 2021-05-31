package com.company;

public class SelectionSort {


    public void SelectionSort (int arr[]) {
        int minindex;
        for (int i = 0; i < arr.length ; i++) {
            minindex = i;
            for (int j = i; j < arr.length ; j++)
                if (arr[j] < arr[minindex]) {
                    int temp = arr[j];
                    arr[j] = arr[minindex];
                    arr[minindex] = temp;
                }

        }


    }





}
