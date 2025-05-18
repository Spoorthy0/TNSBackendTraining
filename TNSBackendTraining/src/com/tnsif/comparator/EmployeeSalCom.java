package com.tnsif.comparator;

import java.util.Comparator;

public class EmployeeSalCom implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.sal==e2.sal)
		return 0 ;
		else if(e1.sal>e2.sal)
			return 1;
		else
			return -1;
	}
}
