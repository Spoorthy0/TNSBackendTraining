package com.tnsif.Arrays;

public class JaggedArray {
     public void printArray() {
    	 int arr[][]= {{1,2},{2,3,4},{3,4,5,6}};
    	 System.out.println("Printing the array using for loop");
  	   for(int i=0;i<arr.length;i++) {
  		  for(int j=0;j<arr[i].length;j++) {   
  	   
  		   System.out.println(arr[i][j]+" ");
     }
}
     }
}
