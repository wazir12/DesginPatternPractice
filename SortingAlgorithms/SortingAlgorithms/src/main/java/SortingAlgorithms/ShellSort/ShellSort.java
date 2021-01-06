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
public class ShellSort {
   public static void main(String[] args){
       int[] arr = {
         58,
         80,
         88,
         45,
         9,
         17,93,20,51,67
       };
       
       System.out.println("UNSORTED ARRAY:\n ");
       Main.printArray(arr);
       
       performShellSort(arr);
   } 

    private static void performShellSort(int[] arr) {
         int n = arr.length;
        // Each value of gap , performing insertion sort
        for(int gap= n/2;gap>=1;gap=gap/2){
            System.out.println("\nWhen gap = "+gap);
            for(int i= gap; i<n;i++){
                
                int current = arr[i];
                System.out.println("\nCURRENT= "+current);
                int j;
            
                for(j=i ;j>=gap && current<arr[j-gap];j=j-gap){
                    arr[j]= arr[j-gap];
                }
                
                arr[j] = current; 
                System.out.println("\nPartial Sorting for i= "+i);
                Main.printArray(arr);
            }
        }
        System.out.println("Final Sorted Array:\n");
        Main.printArray(arr);
        
        
    }
}
