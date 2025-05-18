package com.tnsif.comparator;

import java.util.Comparator;

public class EmployeeNameCom  implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.ename.compareTo(e2.ename);
	}
}


