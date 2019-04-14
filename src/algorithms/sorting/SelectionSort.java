/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

import static algorithms.sorting.BubbleSort.printArray;

/**
 *
 * @author Ibrahim.fouad
 */
public class SelectionSort {
    
    public static void main(String[] args) {
        int arr[] = {5,2,10,7,12,1,9,8};
        printArray(sort(arr));
        
    }
    
  private static int[]  sort(int arr[]){
    for(int i =0;i<arr.length;i++){
       int smallestIndex=i; 
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[smallestIndex] ){
               smallestIndex =j;
               
            } 
        }
        //swap
        int temp = arr[i];
        arr[i]=arr[smallestIndex];
        arr[smallestIndex]= temp;
       
    }
    return arr; 
       
   } 
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    
}
