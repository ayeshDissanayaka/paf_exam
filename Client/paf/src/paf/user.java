package paf;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class user {


	public String login(String name, String password)
	{
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userNameDB = "";
		String passwordDB = "";

		try
		{
			con = dbConnection.createConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery("select name, password");
			
			while(resultSet.next())
			{
				userNameDB = resultSet.getString("nameUsers");
				passwordDB = resultSet.getString("passUsers");
				
				if(name.equals(userNameDB) && password.equals(passwordDB))
				{
					return "SUCCESS";
				}

			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return "Invalid...";

	

}
}
