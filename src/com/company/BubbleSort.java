package com.company;

public class BubbleSort {






    // Bubble Sort algorithm
    public void BubbleSort(int ... arr ) {
        boolean flag;
        for (var i = 0; i < arr.length; i++) {
            flag = true;
            for (var j = 1 ; j < arr.length - i; j++)         // to decrease numbers of iterations
                if (arr[j] < arr[j-1]) {
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = temp;
                    flag = false;
                }

            if (flag)
                return;

        }

    }






    }



