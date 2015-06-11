package DataBase;

import java.sql.*;

public class baseDeDonnees {
	public static void baseDeDonees(){
		System.out.println("Test");
		String url = "jdbc:mysql://localhost:3306/towerdevlabs";
		String login = "root";
		String mdp = "admin";
		Connection connexion = null;
		Statement stmt;
		try{
			connexion = DriverManager.getConnection(url,login,mdp);
			System.out.println("TEST WECH");
			stmt = connexion.createStatement();
			System.out.println("TEST Pas WECH");
			ResultSet resultatBdd = stmt.executeQuery("SELECT Map");
		while (resultatBdd.next()){
			String carte = resultatBdd.getString("Map");
			System.out.println("Carte :" + carte);
		}
		}
		catch(SQLException e){
			
		}
		finally{
			if(connexion != null )
				try{
					connexion.close();
				}
				catch(SQLException ignore){
			}
		}
}
}