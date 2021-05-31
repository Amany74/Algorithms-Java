package com.company;

public class insertionSort {

    public void insertionSort(int [] arr ){
        for(int i = 1 ; i < arr.length ; i++){
            int current = arr[i];
            int j = i -1 ; // bd2na i bwa7d 34an by default awl 3onsr ale wa2f 3leh j ka2no in the right position
            while(j >= 0 && arr[j] > current ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= current ;  // la2n hna kda al j = -1 aw al rakm mzbot 34an n2st gowa al loop
        }
    }


}
