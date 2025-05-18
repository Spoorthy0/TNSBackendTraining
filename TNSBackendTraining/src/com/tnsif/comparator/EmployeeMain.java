package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(101,"Spoorthy",60000));
		l.add(new Employee(203,"Mithra",52000));
		l.add(new Employee(301,"Aishu",67000));
		l.add(new Employee(102,"Pooja",57700));
		//retrieving data based on name sorting
		System.out.println("Sort by name");
		Collections.sort(l,new EmployeeNameCom());
		for(Employee e:l) {
			System.out.println(e.eid+","+e.ename+","+e.sal);
		}
		
		//retrieving data based on salary sorting
		System.out.println("Sort by sal");
		Collections.sort(l,new EmployeeSalCom());
		for(Employee e:l) {
			System.out.println(e.eid+","+e.ename+","+e.sal);
		}
	}

		

	}

