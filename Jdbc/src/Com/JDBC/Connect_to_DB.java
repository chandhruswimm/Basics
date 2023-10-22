package Com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect_to_DB {

	public static void main(String[] args) {
		
		Connect_to_DB cd=new Connect_to_DB();
		cd.toDB();
		cd.fromDB();
	}

	private void fromDB() {
		try {
			//1.to load driver class,driver is software which establish connectivity between java and DBMS
		Class.forName("org.postgresql.Driver");
		
		//2.to connect DB using postgresql
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandrudb","postgres","1234");
		
		//3.to prepare query
		Statement stm=con.createStatement();
		
		//4.executing query
		stm.executeUpdate("insert into product values(2,'chan')");
		stm.close();
		//con.commit();
		con.close();
		System.out.println("sucessfully install");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	private void toDB() {
		try {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandrudb","postgres","1234");
		Statement stm=con.createStatement();
		//ResultSet rs=stm.executeQuery("select * from product");
		int id=2;
		ResultSet rs=stm.executeQuery("select * from product where id="+id);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			rs.close();
			stm.close();
			con.close();
		}
		}
catch(Exception e){
	System.out.println(e);
}
}
}
