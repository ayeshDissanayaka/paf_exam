package paf;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Item {
	
	public String getItems() 
	{             
		String itemsGrid = null;             
		Connection con = null;             
		Statement st = null;             
		ResultSet rs = null;       
		
		try {       
			con = dbConnection.createConnection();     
			st = con.createStatement();    
			rs = st.executeQuery("select * from items");     
			
			if (rs.first())       
			{ 
				itemsGrid = "<table border='1' cellspacing='1' cellpadding='1'>"
						+ "<tr>"
						+ "<th>email</th>"
						+ "<th>name</th>"
						+ "<th>password</th>"
						+ "<th>userID</th>"
						+ "</tr>"; 
				rs.beforeFirst(); 
				
				while(rs.next())  
				{   
					itemsGrid = itemsGrid + "<tr><td>" + rs.getString(1) + 
							"</td>"      + "<td>" + rs.getString(2) + "</td>"     
							+ "<td>" + rs.getString(3) + "</td>"      
							+ "<td><input id=\"btnEdit\" type=\"button\" name=\"btnEdit\"  param=\"" 
							+ rs.getString(1) + "\" value=\"Edit\"</td>"      
							+ "<td>" + "<input id=\"btnRemove\" type=\"button\" name=\"btnRemove\" param=\"" 
							+ rs.getString(1) + "\" value=\"Remove\"</td></tr>";                        
				} 
				
			}                   
			else                         
				itemsGrid = " no items";                   
				itemsGrid = itemsGrid + "</table></br>";             
			}             
		catch (SQLException e) 
		{                   
			e.printStackTrace();             
		}             
		
		return itemsGrid;       
		
		}       
	
		public String saveAnItem(String name) 
		{
			String res = null;             
			String sql = null;            
			Connection con = null;             
			Statement st = null;             
			try 
			{                   
				con = dbConnection.createConnection();                  
				st = con.createStatement();                  
				sql = "insert into items (name) values ('" + name + "')";                   
				st.executeUpdate(sql);                   
				res = "Successfully added";             
			}             
			catch (SQLException e) 
			{                   
				e.printStackTrace();             
			}             
			
			return res;       
			
		}

}
