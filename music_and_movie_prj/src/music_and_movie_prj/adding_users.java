package music_and_movie_prj;
import java.sql.*;


public class Adding_users {

	public static void creating_user() {
		
	//admin
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =
	DriverManager.getConnection("jdbc:mysql://localhost:3306/music_movie","root","");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("insert into users values");
	
	
	while(rs.next())
	{
	System.out.println("ID " + rs.getInt(1) + " Name: " + rs.getString(2) + " password "	+ rs.getString(3) +" email address"+rs.getString(4));
	}
	con.close();
	} catch(Exception e)
	{
	System.out.println(e);
	}
	}
	//user
	
		
	
	
	
	
	
	public static void main() {
	
		creating_user();
	}
}
