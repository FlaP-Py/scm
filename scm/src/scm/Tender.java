package scm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tender {
	String tenderID;
	String compName;
	String desc;
	String type;
	String dateCreated;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/SCM";
	static final String USER = "root";
	static final String PASS = "coincidence";
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getTenderID() {
		return tenderID;
	}
	public void setTenderID(String tenderID) {
		this.tenderID = tenderID;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void addToDB(){
		Connection conn = null;
		java.sql.Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO Tenders VALUES('"+this.compName+"','"+this.tenderID+"','"+this.desc+"','"+"','"+this.type+"','"+this.dateCreated+"');";
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
	public void createtenderDB(){
		//
	}
	public Tender(String tenderID, String compName, String desc, String type, String dateCreated) {
		super();
		this.tenderID = tenderID;
		this.compName = compName;
		this.desc = desc;
		this.type = type;
		this.dateCreated = dateCreated;
	}
	public void claimTender(){
		//
	}
}