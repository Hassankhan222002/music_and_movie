package music_and_movie_prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login_user {

public static void login_info(String name ,String password) {
		String username = null,passwordrs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/music_movie","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from users where name='"+name+"' and password='"+password+"'" );
			
			
			while(rs.next())
			{
			System.out.println("username " + rs.getString(2) + " password: " + rs.getString(3));
			passwordrs=rs.getString(3);
			username=rs.getString(2);
			};
			con.close();
			} catch(Exception e)
			{
			//System.out.println("data is not available");
			System.out.println(e);
			}
		if(username==name && passwordrs==password) {
			System.out.println("successfully login");
			
		}
		else {
			System.out.println("login failed");
		}
		
		}
}


