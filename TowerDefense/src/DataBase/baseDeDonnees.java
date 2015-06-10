package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baseDeDonnees {
	public static void baseDeDonees(){
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/towerdevlabs","root","admin");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from employees");
		}
		catch(SQLException e){
			System.out.println("Epitaph !");
		}
	}
}
