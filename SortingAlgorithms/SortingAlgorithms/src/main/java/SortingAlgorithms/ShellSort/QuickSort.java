/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.ShellSort;

import SortingAlgorithms.Main;

/**
 *
 * @author simchu
 */
public class QuickSort {
    public static void main(String[] args){
        int [] arr ={
            10,
            20,
            5,
            25,
            6,12,16,18,11,200,110,114
              
        };
        quickSort(arr,0,arr.length-1);
        Main.printArray(arr);
    }
    public static void quickSort(int[] arr, int lb,int ub){
        //If there is one element or no element than terminate Quick Sort
        if(lb>=ub){
            return;
        }
        int j = partition(arr,lb,ub);
        
        //Now Sort the Unsorted part from lb to ub=j-1
        quickSort(arr,lb,j-1);
        //finally do quick sort for other unsorted part from lb = j+1 to ub
        quickSort(arr,j+1,ub);
    }

    private static int partition(int[] arr, int lb, int ub) {
        //Initially down should start from lb and up from ub
        int down = lb;
        int up = ub;
        //pivot is left most element of the subarray  but to improve the worst case complexity
        //from O(n^2) to O(logn) randomly choos pivot
        int pivot = arr[lb];
        
        //Iterate as long as down is less than up
        while(down<up){
        
             //move down to the right unless the number at index down is less or equal to pivot
             //and down is less than ub
             //Here, we are searching for a number greater than pivot from the left array
             // And if that is found we stop
            while(arr[down]<=pivot && down<up){
                down++;
            }
            //Searching for a number at right of the array
            //Move up to the left as long as the number is greater than pivot
            while(arr[up]>pivot){
                up--;
            }
            //Swap array[down ] with array[up]
            if(down<up){
              int temp = arr[up];
              arr[up] = arr[down];
              arr[down] = temp;
            }
        }
        //Now Place the pivot at index up, so exchange the arr[up] with arr[lb]
        arr[lb] = arr[up];
        arr[up] = pivot;
        return up;
    }
}
