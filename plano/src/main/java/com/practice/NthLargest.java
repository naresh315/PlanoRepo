package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class NthLargest {   
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];
	}

	public static int getThirdLargestByArray(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 3];
	}
	 // Main driver method
    public static void sortSpecifiedRange( )
    {
        // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
  
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);
  
        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
        Integer[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort( arr1, Collections.reverseOrder());
        
        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr1));
    }

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Third Largest: " + getThirdLargest(a, 6));
		  sortSpecifiedRange();
		  
		  allmethodsFromArrays();
	}
	/**
	 * 
	 */
	public static  void allmethodsFromArrays(){
		System.out.println("allmethodsFromArrays");
		  int intArr[] = { 10, 20, 2, 22, 35 };
 	        System.out.println(  Arrays.binarySearch(intArr, 35)+" \n"+Arrays.toString(intArr));
 	        
 	        int intKey = 22;
 	  
 	        System.out.println(  intKey  + " found at index = "  + Arrays .binarySearch(intArr, 1, 3, intKey));
 	    
 	  
 	        // Get the second Array
 	       int intArr1[] = { 10, 15, 22 };
 	      int intArr2[] = { 11, 34, 31 };
 	  
 	        // To compare both arrays
 	        System.out.println("Integer Arrays on comparison: "  + Arrays.compare(intArr1, intArr2));
 	        
 	        
		
	}
}