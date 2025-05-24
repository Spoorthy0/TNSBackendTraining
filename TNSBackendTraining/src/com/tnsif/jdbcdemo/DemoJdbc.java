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

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the Driver
		
		Class.forName(DRIVERNAME);
		//establish connection
		
		Connection con=DriverManager.getConnection(URL, Username, Password);
		System.out.println("Connection Established");
		//create a statement
		
		Statement st=con.createStatement();
		
		//EXECUTE STATEMENT OR QUERY
		//Retrieving data
		
		ResultSet rs=st.executeQuery(sql);
		//Process the results
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"-");
			System.out.print(rs.getString("sname")+"-");
			System.out.print(rs.getString("sbranch"));
			System.out.println();
			}
		
		//to check whether inserted or not
		
		boolean status=st.execute(query);
		System.out.println("Inserted");
		
		//UPDATE COMMAND
		
		int updatedCount=st.executeUpdate("update student set sid=107 where sname='Rishi'");
		System.out.println(updatedCount+" rows updated");
		
		//DELETE COMMAND
		
		int deletedCount=st.executeUpdate("delete from student where sid=107");
		System.out.println(deletedCount+" rows deleted");
		
		
		//Close the connection
		con.close();
		System.out.println("Connection closed");

	}
}


