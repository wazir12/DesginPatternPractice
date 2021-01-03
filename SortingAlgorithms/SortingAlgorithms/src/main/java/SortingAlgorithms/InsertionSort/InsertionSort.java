/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.InsertionSort;

import static SortingAlgorithms.BubbleSort.BubbleSort.printArray;

/**
 *
 * @author simchu
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] arr ={
            40,30,20,50,35
        };
        performInsertionSort(arr);
    }

    private static void performInsertionSort(int[] arr) {
       
        for(int i =1;i<arr.length;i++){
            int current = arr[i];
            System.out.println("Current Element in Unsorted Array: "+current);
            int j;
            for( j = i-1;j>=0 && current < arr[j];j--){
                arr[j+1]= arr[j];
                printArray(arr);
                System.out.println("\n");
                
            }
            arr[j+1] = current;
            System.out.println(" Sorted Array at Iteration "+i+" :"); 
            System.out.println("\n");
            printArray(arr);
            
        }
        
    }
    
}
