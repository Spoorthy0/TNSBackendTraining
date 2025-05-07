package com.tnsif.Arrays;

public class OneDArray {
	//int arr[]= {1,2,3,4,5};
       public void printArray() {
    	   int arr[]= {1,2,3,4,5};
    	   System.out.println("Printing the array using for loop");
    	   for(int i=0;i<arr.length;i++) {
    		   System.out.println(arr[i]+" ");
    	   }
    	   System.out.println("Printing the array using for each loop");
    	   for(int ele:arr) {
    		   System.out.println(ele+" ");
       }
}
}
