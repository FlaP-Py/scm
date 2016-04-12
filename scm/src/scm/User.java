package scm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class User {
	String compName;
	String id;
	String passwd;
	String contact;
	String address;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/SCM";
	static final String USER = "root";
	static final String PASS = "coincidence";
	public User(String compName, String id, String passwd, String contact, String address) {
		super();
		this.compName = compName;
		this.id = id;
		this.passwd = passwd;
		this.contact = contact;
		this.address = address;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void addToDB(){
		Connection conn = null;
		java.sql.Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO UserNames VALUES('"+this.compName+"','"+this.id+"','"+this.passwd+"','"+"','"+this.contact+"','"+this.address+"');";
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		}catch(SQLException se1){     
			se1.printStackTrace();
		}catch(Exception e){          
			e.printStackTrace();
		}
     	finally{
     		try{
     			if(stmt!=null)
     				stmt.close();
     		}catch(SQLException se2){}
     		try{
     			if(conn!=null)
     				conn.close();
     		}catch(SQLException se3){
     			se3.printStackTrace();
     		} 
     	}
	}
	public void searchCompany(String Comp){
		//
	}
}
