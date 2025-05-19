package com.tnsif.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamOperations {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(new Employee(101,"Spoorthy",67000));
		ls.add(new Employee(102,"Mithra",69000));
		ls.add(new Employee(103,"Aishu",62000));
		ls.add(new Employee(104,"Pooja",61000));
	
		//Filter based on salary
		
		Stream<Employee> st= ls.stream().filter(sal->sal.esal>62000);
		st.forEach(n->System.out.println(n.empid+":"+n.ename));
	
		//map(Retrive the names of employees in uppercase)
		
		System.out.println("Names in uppercase using map: ");
		//String[] str= {"Spoorthy","Mithra","Aishu","Pooja"};
		List<String> ls1=Arrays.asList("Rakesh","Rishi","Raju");
		
		//String s=new String();
		//s.toUppercase();
		
		ls1.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//Sorting
		
		System.out.println("Sorted operation:");
		List<String> name=Arrays.asList("Rakesh","Ram","Raju");
		name.stream().sorted().forEach(System.out::println);
		
		//Uppercase and sorting in single go
		System.out.println("Uppercase and sorting in single go");
		
		List<String> ls2=Arrays.asList("Rakesh","Rishi","Raju");
		ls2.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		

	}

}
