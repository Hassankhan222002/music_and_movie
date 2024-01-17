package music_and_movie_prj;

import java.sql.*;

public class Feedback {
	public void getFeedback(String Email,String category,String comment) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/music_movie","root","");
			Statement stmt=con.createStatement();
			
			
			stmt.executeUpdate("INSERT INTO `feedback` VALUES (NULL,'"+Email+"','"+category+"','"+comment+"')");
			
		
			
		
			con.close();
			//return user_info;
		}
		
		catch(Exception e)
		{
		System.out.println(e);
		}
	
	}
}
