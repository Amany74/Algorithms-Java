package com.company;

public class QuickSort {
    //Quick sort   Algorithm
    // frist partitioning for siting the pivot in the right place
   /*
    private int partition(int[] array, int start, int end) {

        int pivot  = array[end];
        int boundary = start - 1 ;
        for(int i = start ; i <= end ; i++) {
            if(array[i] < pivot ) {
                boundary ++ ;
                // swap
                int temp = array[boundary] ;
                array[boundary] = pivot ;
                pivot = temp ; // boumdary
            }
        }
        return boundary ;
    }
//sort to pass items
    public void quickSort(int array[]){
        quickSort(array,0,array.length-1);
    }

    // lets get back to our quick sort met
    public  void quickSort(int array [] , int start , int end){

        if(start == end) return ;

        int b = partition(array,start,end);

        quickSort(array,start,b-1); //for left  // end ale hia l7d al pivot
        quickSort(array,b+1,end); // right one


    }
    **********************************
    */

    // cheat quick sort
    int partition(int arr[], int start, int end)
    {
        int pivot = arr[end];
        int i = (start-1); // index of smaller element
        for (int j=start; j <= pivot; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[end] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      end  --> Ending index */
  public  void sort(int arr[], int low, int end)
    {
        if (low < end)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, end);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, end);
        }
    }


}
