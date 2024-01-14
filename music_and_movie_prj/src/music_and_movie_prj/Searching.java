package music_and_movie_prj;
import java.sql.*;


public class searching {
	public static String search_movie(String name) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/music_movie","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from info where info.name = '"+name+"'");
			
			
			rs.next();
			String movie_name=("name" + rs.getString(1) + "genre" + rs.getString(2) + " status "	+ rs.getString(3) +"category "+rs.getString(4));
			
			con.close();
			return movie_name; 
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return" ";
			}

		
	}

