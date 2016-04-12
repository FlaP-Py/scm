package scm;

public class User {
	String compName;
	String id;
	String passwd;
	String contact;
	String address;
	
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
		//
	}
	public void searchCompany(String Comp){
		//
	}
}
