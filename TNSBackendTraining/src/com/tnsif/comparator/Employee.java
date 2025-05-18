package com.tnsif.comparator;

public class Employee {
		public int eid;
		public String ename;
		public float sal;
		
		public Employee(int eid, String ename, float sal) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
		}
		
}
