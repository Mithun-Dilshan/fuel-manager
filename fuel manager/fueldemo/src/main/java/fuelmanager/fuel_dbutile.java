
package fuelmanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




public class fuel_dbutile {
	
	
	 private static Connection con = null;
      private static java.sql.Statement stmt = null;
      private static ResultSet rs = null;
      
      
      
      
	public static boolean insertservlet(String ftype,String n_capacity,String f_remain,String price, String a_date,String nc_date,String m_name ,String eid ) {
		boolean isSuccess = false;
		
		try {
		
			
			 con =dbconnect.getConnection();
			 stmt =con.createStatement();
			String sql = "insert into fuel values (0,'"+ftype+"','"+n_capacity+"','"+f_remain+"','"+price+"','"+a_date+"','"+nc_date+"','"+m_name+"','"+eid+"')";
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			}
			
		catch (Exception e) {
			e.printStackTrace();
		
		}
	
	
	return isSuccess;





	
}
public static List<fuel>getfuel(){
	
	
	ArrayList<fuel> ful =new ArrayList<>();
	
	try {
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql ="select * from fuel ";
		rs =stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String ftype =rs.getString(2);
			String n_capacity = rs.getString(3);
			String f_remain = rs.getString(4);
			String price = rs.getString(5);
			String a_date = rs.getString(6);
			String nc_date = rs.getString(7);
			String m_name = rs.getString(8);
			String eid = rs.getString(9);
			
			fuel c=new fuel( id,ftype, n_capacity , f_remain,price,a_date,nc_date,m_name,eid );
			ful.add(c);
			System.out.println(c.toString());
		}
			
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}



	return ful;


}
public static List<fuel> getCustomerDetails(String Id) {
	
	int convertedID = Integer.parseInt(Id);
	
	ArrayList<fuel> ful = new ArrayList<>();
	
	try {
		
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from fuel where id='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String ftype =rs.getString(2);
			String n_capacity = rs.getString(3);
			String f_remain = rs.getString(4);
			String price = rs.getString(5);
			String a_date = rs.getString(6);
			String nc_date = rs.getString(7);
			String m_name = rs.getString(8);
			String eid = rs.getString(9);
			
			
			fuel c=new fuel( id,ftype, n_capacity , f_remain,price,a_date,nc_date,m_name,eid );
			ful.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return ful;	
}




}
