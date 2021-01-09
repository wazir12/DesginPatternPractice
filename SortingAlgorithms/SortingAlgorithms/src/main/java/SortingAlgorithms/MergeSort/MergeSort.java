/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.MergeSort;

import SortingAlgorithms.Main;

/**
 *
 * @author simchu
 */
public class MergeSort {
    
    public static void main(String[] args){
       int[] arr ={
           10,
           14,
           5,
           6,8,11,13,191,212,112
       } ;
       int[] temp = new int[arr.length];
       mergeSort(0, arr.length-1,temp,arr);
       Main.printArray(arr);
    }

    private static void mergeSort(int lb, int ub,int[] temp, int[] arr) {
        
        if(lb>=ub){
            return;
        }
        //Find middle element of array
        int mid = (lb+ub)/2;
        //sort the left array using merge sort
        mergeSort(lb,mid,temp, arr);
        //sort the right array using merge sort
        mergeSort(mid+1,ub,temp,arr);
        //Merge both the array
        merge(arr, temp, lb, ub, mid);
      }

    private static void merge(int[] arr, int[] temp, int lb, int ub, int mid) {
    	int i, j, k;
    for(i = lb, j = mid+1, k = lb; i <= mid && j <= ub; ++k){
        if (arr[i] <= arr[j]){
            temp[k] = arr[i];
            i++;
        }
        else {
            temp[k] = arr[j];
            j++;
        }
    } // end of for
    // copy the additional elements, if any there in the sorted sections
    while(i <= mid){
        temp[k] = arr[i];
        k++; i++;
    }
    
    while(j <= ub){
        temp[k] = arr[j];
        k++; j++;
    }
    
    // finally copy back the merged sorted numbers from temp to array
    for(i = lb; i <= ub; ++i){
        arr[i] = temp[i];
    }
    }
    
}
