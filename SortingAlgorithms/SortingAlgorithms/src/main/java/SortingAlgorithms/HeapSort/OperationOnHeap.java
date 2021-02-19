/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.HeapSort;

/**
 *
 * @author simchu
 */
public class OperationOnHeap {
    public static int deleteHeap(int[] heap, int heap_size){
        //saving the root element of heap in a variable
        int item = heap[1];
        //copying last elemnt of heap to root
        heap[1] = heap[heap_size];
        //reduce heap size by 1
        heap_size = heap_size - 1;
        //call adjust operation for restoring heap at index 1
        adjust(heap,1,heap_size);
        
        return item;
    }
    public static void main(String[] args){
        
        int[] heap = {
            0,
            90,
            80,65,50,70,40,30,20,25,45
        };
        int heap_size = 10;
        System.out.println("Deleted Root Element: "+deleteHeap(heap,heap_size));
        /**for(int i:heap){
            System.out.println(i);
        }**/
        
    }

    public static void adjust(int[] heap, int i, int heap_size) {
       //THe Max heap is maintained at index 2i and 2i+1 
       // But is not maintained at index i
       //Finding left child of i(root)
       int j =2*i;
       //Storing root element of heap in temp variable
       int temp =heap[i];
       
       while(j<=heap_size){
          if(j<heap_size && heap[j] < heap[j+1]){
              j=j+1;
          } 
          
          if(temp>=heap[j]){
              j=2*j;
          }
          
     
       }
         
       heap[j/2] = temp;
               
    }
    
}
