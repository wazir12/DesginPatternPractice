/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms.HeapSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author simchu
 */
public class Heap {
    /**
	 * integer array that is going to hold some integer numbers for sorting
	 */
    private int[] arr;

    /**
	 * Parameterized constructor, receives the size of the array and allocates the array for size + 1
	 * the array will be used for heap, the first index is 1 and the last is size.
	 * we need to allocate one more element than size to use indices from 1 to size.
	 * @param size size of the array, precondition is size > 0
	 */
    public Heap(int size) {
        // allocating the array for heap, the allocation is one more than the actual size
        // so that we can use from index 1 to size
        this.arr = new int[size+1];
    }
    /**
````* Sorts the array using heapsort logic after building heap in place using heapify
``` * @return time taken to sort the array in milli seconds
````*/
    
    public long heapSort(){
        
        long startTime = System.currentTimeMillis();
	// write heap sort
        //Building heap from array elemts
        heapify();
       int n = arr.length-1; 
        for(int i = n;i>=2;--i){
            
            int temp = arr[1];
            arr[1]=arr[i];
            
            adjust(1,i-1);
            
            arr[i] = temp;
            
            
            
                    
            
        }
                
        long endTime =  System.currentTimeMillis();
        return endTime - startTime;
    }
    
    /**
    * Builds heap in-place in linear time(O(n)) without using extra space
    */
    
    public void heapify(){
        int i;
        int n = arr.length-1;
        for (i=n/2;i>=1;--i){
            adjust(i,n);
        }
        
    }
    
    /**
	 * Adjusts the index i for max heap when at index 2*i (left child) a max heap is maintained and also at 
	 * 2*i + 1 (right child) a max heap is maintained, this method makes sure that at index i a max heap is also 
	 * maintained
	 * @param i index that is to be adjusted for max heap
	 * @param n total elements in the heap.
	 */
    public void adjust(int i , int n){
        int j = 2*i;
        int item = arr[i];
        while(j<=n){
            //checking if left child does have children and if it is smaller than its sibling or not
            if(j <n && arr[j]<arr[j+1]){
                //j will point to index of the larger sibling
                j=j+1;
            }
            //check if item is greater than left or right max heap which ever is greater among them or not
            if(item>=arr[j]){
                //found place for item in the heap
                break;
                
            }
            //if the item is less than current element than place the current element at its parent at j/2
            arr[j/2]=arr[j];
            j=2*j;
        }
        arr[j/2] = item;
        
        
        
    }
    
   /**
    * Method that prints the content of the array into the console
    */
    public void printToConsole() {
	System.out.println("Content of the array: ");
	// iterate through each element of the array and print them into the console
	for(int i = 1; i < arr.length; ++i) {
            System.out.printf("%6d", arr[i]);
                // after each 10 element is printed, move to new line.
                 if (i  % 10 == 0)
                    System.out.println();
	}
	
        System.out.println("\n");
        
    }
    
    /**
	 * Fills the instance member array with random integers in the range 0 - 9999, uses java.util.Random class
	 * for generating the integers.
    */
    
    public void fillRandom(){
        Random random = new Random();
        for(int i = 1; i < arr.length;i++ ){
            arr[i] = random.nextInt(10000);
        }
    }
    
    /**
    * Method to input data for array from keyboard, you may find this useful for testing with data from keyboard.
    */
    public void inputFromConsole() {
	// Need object of Scanner class to read value from console, System.in is the reference to the keyboard object
	// in Java, so passing System.in to the constructor of the Scanner will make the keyboard as source of reading.
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input integers, you would require to input " + arr.length + " integers");
	// Iterate through the array elements.
	for(int i = 1; i < arr.length; ++i) {
            System.out.printf("array[%d]: ", i);
            // read the integer and assign that to the ith element of the array.
            arr[i] = scanner.nextInt();
	}
    }
    
    /**
	 * Method to test if instance member array indeed contains sorted elememts in a particular order
	 * or not. If it contains sorted elements returns true, otherwise returns false.
	 * If the ascensingOrder is true, this method will test if the array is sorted in ascending order,
	 * if ascending order is false, this will check if the array contains elements in descending order.
	 *
	 *  This methos will be useful when we have large number of elements in the array and we want to
	 *  check whether the array is sorted or not in a particular order, as it will not be possible to
	 *  check bby printing the elements into the console if it contains large number of elements.
	 *
	 * @param ascendingOrder the order in which the method will check the array. True for ascending order,
	 * false for descending order
	 * @return true if the array is sorted in the order asked for, false otherwise.
	 */
	public boolean isSorted(boolean ascendingOrder) {
		// intially we consider that the array is sorted
		boolean sorted = true;
		// iterate as long as there are elements in the array and the array is sorted
		for(int i = 1; i < arr.length - 1 && sorted; ++i) {
			// if we are testing ascendingOrder then every element must be less than it's next,
			// if not, that means if any element is larger than it's next element the array is not sorted
			// in ascending order
			if (ascendingOrder && arr[i] > arr[i+1]) {
				sorted = false;
			}

			// If we are testing descending order, then every element of the array must be larger than the next,
			// if any element is less than the next one, then the array is not sorted in descending order.
			if (!ascendingOrder && arr[i] < arr[i+1]) {
				sorted = false;
			}
		}
		// finally return the sorted flag.
		return sorted;
	}
    
    public static void main(String[] args){
    int size = 20;
		Heap objHeap = new Heap(size);
		objHeap.fillRandom();
		System.out.println();
		System.out.println("Unsorted array: ");
                objHeap.printToConsole();
		
		System.out.println("Going to call merge sort, please wait...");
		long ellapesedTime = objHeap.heapSort();
		if (objHeap.isSorted(true)) {
			System.out.println("Sorted in ascending order");
		}
		else {
			System.out.println("Not Sorted in ascending order");
		}
		System.out.println("Sorted array: ");
                 objHeap.printToConsole();
		System.out.println("Time taken to sort " + size + " integers using Heap Sort is " + ellapesedTime + " milliseconds.");
		System.out.println();
        
        
    }
    
}
