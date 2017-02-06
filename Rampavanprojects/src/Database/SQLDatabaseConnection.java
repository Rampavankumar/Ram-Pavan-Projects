package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLDatabaseConnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// Loading
			/*String connectionString = "jdbc:oracle:thin:@localhost:1521:xe","system","oracle";*/
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","admin");
			System.out.println("COnnected");
			
			PreparedStatement ps=connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
			/*PreparedStatement ps=connection.prepareStatement("UPDATE ACCOUNT SET balance=? ram=? WHERE accno=?");*/
			
			/*
			ps.setInt(1, 1001);
		ps.setInt(1, 1002);
			ps.setString(2, "ram");
			ps.setString(2, "pavan");
	       ps.setInt(3, 10000);
			ps.setInt(2, 100000);
			ps.executeUpdate();
			System.out.println(ps);
			System.out.println("record inserted successfully");*/
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the name and balace");
			
			 
			  while(true)
			  {
				  System.out.println("Enter name"); 
				   String ram =scanner.next();
				  
				  System.out.println("accout  number");
				  int num=scanner.nextInt();
				  System.out.println("Enter balance"); 
			  int accno = scanner.nextInt();
			 
			  
			  
			  System.out.println("enter age");
			  String age =scanner.next();
			  
			  System.out.println("enter city");
			  String city =scanner.next();
			  
			  
			 ps.setString(5,city); 
			 ps.setInt(1,num);
			 ps.setInt(2, accno);
			 ps.setString(3, ram);
			 ps.setString(4, age);
			  ps.executeUpdate();
			  System.out.println(ps);
			  
			  System.out.println("Record UPDATED"); 
			  System.out.println(
			  "You want to UPDATE another record??"); String choice =
			  scanner.next(); if(choice.equalsIgnoreCase("no")) {
				  break;
			  }		  
				
			  }
			
	/*		
			
			
			 * //PreparedStatement ps = connection.prepareStatement(
			 * "INSERT INTO ACCOUNTS VALUES(?,?)"); // PreparedStatement ps =
			 * connection.prepareStatement(
			 * "DELETE FROM ACCOUNTS WHERE ACCOUNTNO=?"); PreparedStatement ps =
			 * connection.prepareStatement(
			 * "UPDATE ACCOUNTS SET BALANCE =? WHERE ACCOUNTNO=?");
			 * 
			 * Scanner scanner = new Scanner(System.in);
			 * 
			 * 
			 * while(true){ System.out.println("Enter Account number"); String
			 * accno = scanner.next();
			 * 
			 * System.out.println("Enter Balance"); double balance =
			 * scanner.nextDouble();
			 * 
			 * ps.setString(2, accno); ps.setDouble(1, balance);
			 * ps.executeUpdate();
			 * g.
			  System.out.println("Record UPDATED"); System.out.println(
			  "You want to delete another record??"); String choice =
			 scanner.next(); if(choice.equalsIgnoreCase("no")) break;
			 
			 } ps.close(); connection.close();
			 
			 

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT ACCOUNTNO,BALANCE FROM ACCOUNTS");
			if (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getDouble(2));
			}*/
			ps.close();
			connection.close();
			

			  } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	

}
