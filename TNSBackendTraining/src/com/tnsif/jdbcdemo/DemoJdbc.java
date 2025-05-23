package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {
	private static String DRIVERNAME="org.postgresql.Driver"; 
	private static String Username="postgres";
	private static String Password="panda";
	private static String URL="jdbc:postgresql://localhost:5432/TNS-BackendTraining";
	private static String sql="select * from student";
	private static String query="insert into student values(105,'Rishi','DS')";
	private static String query1="update student set sid=107 where sname='Rishi'";
	private static String query2="delete from student where sid=107";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the Driver
		Class.forName(DRIVERNAME);
		//create connection
		Connection con=DriverManager.getConnection(URL, Username, Password);
		System.out.println("Connection Established");
		//create statement
		Statement st=con.createStatement();
		//EXECUTE STATEMENT
		//Retrieving data
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"-");
			System.out.print(rs.getString("sname")+"-");
			System.out.print(rs.getString("sbranch"));
			System.out.println();
			}
		
		//to check whether inserted or not
		
		boolean status=st.execute(query);
		System.out.println("Inserted");
		
		//to check table is updated or not
		boolean state=st.execute(query1);
		System.out.println("Updated");
		
		//to check deleted or not
		
		boolean result=st.execute(query2);
		System.out.println("Deleted");
		
		
		//Close the connection
		con.close();
		System.out.println("Connection closed");

	}
}


