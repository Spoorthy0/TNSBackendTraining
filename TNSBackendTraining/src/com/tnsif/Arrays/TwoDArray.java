package com.tnsif.Arrays;

public class TwoDArray {
        public void printArray() {
        	int a[][]= {{1,2,3,4},{3,5,6,7}};
        System.out.println("Printing the array using for loop");
     	   for(int i=0;i<a.length;i++) {
     		 for(int j=0;j<4;j++) {   
     		   System.out.print(a[i][j]+" ");
     		 }
     		 System.out.println();
        }
     	  System.out.println("Printing the array using for each loop");
    	   for(int[] ele:a) {
    		 for(int element:ele) {   
    		   System.out.print(element+" ");
     	   
        }
    		 System.out.println();
    	   }
        }
}
