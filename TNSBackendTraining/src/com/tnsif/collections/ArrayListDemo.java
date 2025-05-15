//Collection:List

package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(5);
		nums.add(4);
		nums.add(3);
		//System.out.println(nums);
		for(int n:nums) {
			System.out.println(n);
		}
		System.out.println("the size of nums is : "+nums.size());
		System.out.println("To check whether nums is empty or not : "+nums.isEmpty());
		System.out.println("to check whether nums contains an object : "+nums.contains(5));
		System.out.println("To remove an object : "+nums.remove(2));
		System.out.println("To retain all the values : "+nums.retainAll(nums));
		System.out.println("The element at first position is : "+nums.get(1));
		System.out.println("Array conversion to return in proper sequence :");
		Object[] obj=nums.toArray();
		for(Object ob:obj) {
			System.out.println(ob);
		}
		System.out.println("Using iterator:");
		Iterator<Integer> i=nums.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		nums.clear();
		System.out.println("After using clear() is nums is :" + nums);
		nums.add(7);
		System.out.println(nums);

	}

}
