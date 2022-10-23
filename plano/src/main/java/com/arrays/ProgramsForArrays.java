package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ProgramsForArrays {
	static int intArray[]= {11, 10,10,23,23,11 ,23,23,4,5,4,21,971 };
	static   int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9, 10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
	public static void main(String[] args) {
		  removeDuplicate();
		  jdk8();
	}

	public static void jdk8() {
		System.out.println("\njdk8  " + Arrays.toString(intArray));
		Arrays.parallelSort(intArray);
		System.out.println("\nsorted jdk8  " + Arrays.toString(intArray));
		
		System.out.println("\n position of 4: jdk8  " + Arrays.binarySearch(intArray, 0, 12, 4));
		System.out.println(" Average::"+(Arrays.stream(arr_sample1).average().getAsDouble()));
		System.out.println(" int average " + Arrays.stream(intArray).average().getAsDouble());
 		System.out.println("Example of findAny() : ");
		System.out.println(Arrays.stream(arr_sample1).findAny().getAsInt());

	}
	public static void removeDuplicate() {
		System.out.println(" Remove Duplicate is called");
		int[] tmpArr = new int[intArray.length];
		int j = 0;
		for(int i = 0 ; i < intArray.length-1 ; i++) {
		   if(intArray[i] != intArray[i+1]) {
			   tmpArr[j++] = intArray[i];
		   }
			
		}
		for(int k = 0; k< j ;k++ ) {
			System.out.println(" " +tmpArr[k]);
		}
		
		System.out.println("\n Remove duplicate is finished");
	}
	public static void sortArrays() {
		Arrays.stream(intArray).distinct();
		
		System.out.println ("sortArrays"+"\n");
		//9,11,4,3,
		for(int i=0;i <intArray.length-1;i++) {
			for(int j= i+1;j<intArray.length-1;j++) {
				if(intArray[i] > intArray[j]) {
					intArray[i]= intArray[i]+intArray[j];//20
					intArray[j]=  intArray[i]-intArray[j];//20-11=9
					intArray[i]=  intArray[i]-intArray[j];//20-9=11
				}
			}
				System.out.print("  "+intArray[i] );
		}
			
		
	}
	
	public static void rotatePositionOfarrayelems() {
		System.out.println ("rotatePositionOfarrayelems"+"\n");
	 int j = 0;
		for(int i=intArray.length -1;i>=0;i--) {
				System.out.print("  "+intArray[i] );
			}
			
		
	}
	public static void printDuplicate() {
		System.out.println ("PrintDuplicate"+"\n");
	 
		for(int i=0;i<intArray.length -1 ;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i] ==intArray[j]) {
					System.out.print(" "+intArray[i]);
				}
				 
			}
			
		}
	}
	
	public static void leftRotat() {
		System.out.print ("ROTATE");
	  int lastELemn = intArray[intArray.length -1];
		for(int i=0;i<intArray.length -1 ;i++) {
			intArray[i] = intArray[i+1];
			System.out.print (" |^"+lastELemn);
		}
		System.out.print (" |^"+intArray);
	}
  private static void occuranceCountHM() {
	 HashMap<Integer,Integer>   hashMap = new HashMap<>();
	 for (int i = 0; i < intArray.length; i++) {
		if(hashMap.containsKey(intArray[i])){
			hashMap.put(intArray[i],
					                hashMap.get(intArray[i])+1);
		} else {
			hashMap.put(intArray[i],  1);
		}
	}
	 System.out.println(hashMap);
}
private static void occuranceCount() {

	for (int i = 0; i < intArray.length; i++) {
		int counter = 0;
		for (int j = 0; j < intArray.length; j++) {
			if (intArray[j] == intArray[i]) {
				counter++;

			}
		}
		
     
	}
}
  
}

 




