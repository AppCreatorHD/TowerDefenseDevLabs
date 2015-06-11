package DataBase;

import java.sql.*;

public class baseDeDonnees {
	public static void baseDeDonees(){
		String url = "jdbc:mysql://localhost/towerdevlabs";
		String login = "root";
		String mdp = "admin";
		Connection connexion = null;
		Statement stmt;
		try{
			connexion = DriverManager.getConnection(url,login,mdp);
			stmt = connexion.createStatement();
			ResultSet resultatBdd = stmt.executeQuery("SELECT Map FROM Carte");
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