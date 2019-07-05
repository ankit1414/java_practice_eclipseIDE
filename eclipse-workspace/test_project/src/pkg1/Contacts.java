package pkg1;

public class Contacts {
	
	private String contactname;
	private String mobilenumber;
	
	public Contacts(String contactname , String mobilenumber) {
		this.contactname = contactname;
		this.mobilenumber = mobilenumber;
	}
	public String getContactname() {
		return contactname;
	}
	
	public String getMobilenumber() {
		return mobilenumber;
	}
	
	public static Contacts createcontact(String name , String mob) {
	
		return new Contacts(name , mob);
	}
	

}
