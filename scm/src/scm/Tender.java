package scm;

public class Tender {
	String tenderID;
	String compName;
	String desc;
	String type;
	String dateCreated;
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
		//
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