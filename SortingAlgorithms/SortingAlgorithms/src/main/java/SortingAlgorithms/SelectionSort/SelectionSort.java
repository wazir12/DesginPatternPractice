/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.SelectionSort;

import static SortingAlgorithms.BubbleSort.BubbleSort.printArray;

/**
 *
 * @author simchu
 */
public class SelectionSort {
    
    public static void main(String[] args){
        
        int[] arr = {
            40,30,20,1,17
        };
        performSelectionSortWithMaxElementAtBottom(arr);
    }
   private static void performSelectionSortWithMaxElementAtBottom(int[] arr){
     for(int i=arr.length-1;i>0;i--){
          int index_of_max = i;
          System.out.println("Iteration: "+(arr.length - 1 - i));
          System.out.println("Current Max: "+arr[index_of_max]);
                for(int j=i-1; j>=0;j--){
                    
                    if(arr[j]>arr[index_of_max]){
                       
                        //Finding the index of the min element in every iteration
                        index_of_max=j;
                        System.out.println("Current Max: "+arr[index_of_max]+" at iteration: "+i);
                    }
                }
                if(index_of_max!=i){
                    //Swapping the min element at the end of each iteration,
                    //if index of min element is not equal to i
                  int temp = arr[i];
                  arr[i] = arr[index_of_max];
                  arr[index_of_max] = temp;
                 
                }
                
                printArray(arr);
     }  
   }
    private static void performSelectionSort(int[] arr) {
        //Total Iteration = N-1
            for(int i=0;i<arr.length-1;i++){
                int index_of_min = i;
                System.out.println("Iteration: "+i);
                System.out.println("Current Min: "+arr[index_of_min]);
                for(int j=i+1; j<arr.length;j++){
                    
                    if(arr[j]<arr[index_of_min]){
                       
                        //Finding the index of the min element in every iteration
                        index_of_min=j;
                        System.out.println("Current Min: "+arr[index_of_min]+" at iteration: "+i);
                    }
                }
                if(index_of_min!=i){
                    //Swapping the min element at the end of each iteration,
                    //if index of min element is not equal to i
                  int temp = arr[i];
                  arr[i] = arr[index_of_min];
                  arr[index_of_min] = temp;
                 
                }
                
                printArray(arr);
            }
    }
    
}
