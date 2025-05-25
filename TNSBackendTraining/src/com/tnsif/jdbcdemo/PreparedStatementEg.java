package com.tnsif.jdbcdemo;

import java.sql.*;

public class PreparedStatementEg {
	public static String URL="jdbc:postgresql://localhost:5432/TNS-BackendTraining";
	public static String Username="postgres";
	public static String Password="panda";

	public static void main(String[] args) {
			String sql="Insert into student values(?,?,?)";
			try {
			Class.forName("org.postgresql.Driver");
	        Connection con=DriverManager.getConnection(URL,Username,Password);
	        System.out.println("Connection Established");
	        
	        // creating PreparedStatement
	        
	        PreparedStatement ps=con.prepareStatement(sql);
	        ps.setInt(1,107);
	        ps.setString(2,"Rishi");
	        ps.setString(3, "CS");
	        ps.executeUpdate();
	        
	        System.out.println("After insertion the values are");
	        Statement st=con.createStatement();
	        
	        ResultSet rs=st.executeQuery("Select * from student");
	        while(rs.next()) {
	        	System.out.print(rs.getInt(1)+"-");
	        	System.out.print(rs.getString(2)+"-");
	        	System.out.print(rs.getString(3));
	        	System.out.println();
	        }
	        
	        //Updating the record
	        ps=con.prepareStatement("update student set sid=? where sname='Rishi'");
	        ps.setInt(1,108);
	        ps.executeUpdate();
	        
	        System.out.println("After updating the values are: ");
	        ResultSet rs1=st.executeQuery("Select * from student");
	        while(rs1.next()) {
	        	System.out.print(rs1.getInt(1)+"-");
	        	System.out.print(rs1.getString(2)+"-");
	        	System.out.print(rs1.getString(3));
	        	System.out.println();
	        }
	        
	        //Deleting the record
	        
	        ps=con.prepareStatement("Delete from student where sid=?");
	        ps.setInt(1,108);
	        ps.executeUpdate();
	        System.out.println("After deleting the values are : ");
	        ResultSet rs2=st.executeQuery("Select * from student");
	        while(rs2.next()) {
	        	System.out.print(rs2.getInt(1)+"-");
	        	System.out.print(rs2.getString(2)+"-");
	        	System.out.print(rs2.getString(3));
	        	System.out.println();
	        }
	        
	        con.close();
	        System.out.println("Connectiion Closed");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	        
	        
	        
		}

	}


