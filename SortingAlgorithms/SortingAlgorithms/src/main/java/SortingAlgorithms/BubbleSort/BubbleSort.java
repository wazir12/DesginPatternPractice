/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.BubbleSort;

/**
 *
 * @author simchu
 */
public class BubbleSort {
  public static void main(String[] args){
      int[] arr = {
          49,80,7,10,20
      };
      //bubbleSort(arr);
      twoWayBubbleSort(arr);
  } 
  private static void twoWayBubbleSort(int[] arr){
      boolean sorted = false;
      for(int i=0; i<arr.length-1 && !sorted;i++){
          sorted=true;
          System.out.println("Iteration: "+i);
          for(int j=0;j<arr.length-1-i;j++)
          {
              if(arr[j]>arr[j+1])
              {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] = temp;
                
                sorted = false;
                
              }
             
            
            System.out.println("Sorted :" + sorted);
            for(int n:arr) {
                System.out.println(n);
            }
            System.out.println("\n");
              
          }
          for(int j=arr.length-1-i;j>i;j--){
              if(arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j] = temp;
                
                sorted = false;
                
              }
              
            System.out.println("Sorted :" + sorted);
            for(int n:arr) {
                System.out.println(n);
            }
            System.out.println("\n");
          }
          
      }
      System.out.println("Final Sorted Array: ");
      for(int number: arr){
          System.out.println(number);
      }
  }
  private static void bubbleSort(int[] arr){
     boolean sorted = false;
      for(int i=0; i<arr.length-1 && !sorted;i++){
          sorted=true;
          System.out.println("Iteration: "+i);
          for(int j=0;j<arr.length-1-i;j++){
              if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] = temp;
                
                sorted = false;
                
              }
            
            System.out.println("Sorted :" + sorted);
            for(int n:arr) {
                System.out.println(n);
            }
            System.out.println("\n");
              
          }
          
      }
      System.out.println("Final Sorted Array: ");
      for(int number: arr){
          System.out.println(number);
      }
      
  }
}
