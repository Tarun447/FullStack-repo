package test;

import Connection.*;
import java.sql.*;
public class A {

	public static void main(String[] args) {
		try
		{
			Connection con = Dao.getConnection();
			// Prepare Statement 
			PreparedStatement ps = con.prepareStatement("select * from car");
			ResultSet rs = ps.executeQuery();
			System.out.println("============Show Content========");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				
			}
			System.out.println("===============================");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}
