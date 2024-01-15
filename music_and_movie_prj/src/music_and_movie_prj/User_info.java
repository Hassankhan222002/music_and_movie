package music_and_movie_prj;
import java.sql.*;

public class User_info {
	
	public static String getuserinfo(String Name,String password,String Email) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/music_movie","root","");
			Statement stmt=con.createStatement();
			
			
			stmt.executeUpdate("INSERT INTO `users` VALUES (NULL,'"+Name+"','"+password+"','"+Email+"')");
			
		
			
		
			con.close();
			//return user_info;
		}
		
		catch(Exception e)
		{
		System.out.println(e);
		}
		return " ";
	}
	
	
	
}

