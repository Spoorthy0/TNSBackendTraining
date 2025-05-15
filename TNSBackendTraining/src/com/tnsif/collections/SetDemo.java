//Collection:Set

package com.tnsif.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	     //HashSet : Does not allow duplicates,Insertion order is not preserved
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(13);
		s1.add(12);
		s1.add(72);
		s1.add(26);
		System.out.println("The elements in list interface : ");
		for(int i:s1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Executon using LinkedHashset(insertion order preserved)");
		//LinkedHashset : Insertion order preserved
		Set<Integer> hs1=new LinkedHashSet<Integer>();
		hs1.add(1);
		hs1.add(12);
		hs1.add(7);
		hs1.add(2);
		for(int i:hs1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Executon using Treeset(it follows natural sorting order)");
		Set<Integer> ts1=new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(12);
		ts1.add(7);
		ts1.add(2);
		System.out.println("Printing using for loop : ");
		for(int i:ts1) {
			System.out.print(i+" ");
	}
		System.out.println();
		System.out.println("Printing using Iterator :");
		Iterator<Integer> values=ts1.iterator();
		while(values.hasNext()) {
			System.out.print(values.next()+" ");
		}
		

	}

}
