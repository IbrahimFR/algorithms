/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author Ibrahim.fouad
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,2,10,7,12,1,9,8};
        printArray(sort(arr));
        
        
    }
  private static int[]  sort(int arr[]){
      
      for(int i =0;i<arr.length;i++){
          
        for(int j = 0;j+1<arr.length-i;j++){
            if(arr[j]>arr[j+1]){
               int temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
        }  
          
          
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
