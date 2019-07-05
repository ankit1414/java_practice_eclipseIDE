package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	//private static Contacts contacts = new Contacts();
	//private Contacts contact;
	private ArrayList <Contacts> contactlist;
	
	
	
//	public MobilePhone(ArrayList<Contacts> contactlist) {
//		super();
//		this.contactlist = contactlist;
//	}
	public MobilePhone() {
		this.contactlist = new ArrayList<Contacts>();
		
	}

	public ArrayList<Contacts> getContactlist() {
		return this.contactlist;
	}

	
	public void savecontact(Contacts contact) {
		
		//Contacts contact = new Contacts(name,mobno);
		boolean condition = addcontact(contact);
		if(condition == false) {
			System.out.println("ERROR : Contact already exists !!!");
		}
		else {
			System.out.println("contactlist updated successfully");
		}
	}
	
	public void editcontacts(String name) {
		int index = findcontact(name);
		if(index == -1) {
			System.out.println("ERROR : contact does not exit !!!");
		}
		else {
			System.out.println("ENTER NEW DETAILS : ");
			System.out.print("enter contact name : ");
			Scanner scanner = new Scanner(System.in);
			String cname = scanner.nextLine();
			System.out.print("enter mobile number : ");
			String mobileno = scanner.nextLine();
			//scanner.close();
			boolean condition = modifycontact(index , Contacts.createcontact(cname, mobileno));
			if(condition == true) {
				System.out.println("Modification successful !");
			}
		}
	}
	
	private boolean modifycontact(int index , Contacts newcontact) {
		contactlist.set(index, newcontact);
		return true;
	}
	
	public void printcontactlist() {
		for(int i=0; i<this.contactlist.size(); i++) {
			System.out.println( (i+1) + ". " + contactlist.get(i).getContactname() + "--> " + contactlist.get(i).getMobilenumber());
		}
	}
	
	private boolean addcontact(Contacts contact) {
		int flag = findcontact(contact.getContactname());
		if(flag == -1) {
			contactlist.add(contact);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void delete(String name) {
		
		boolean condition = deletecontact(name);
		if(condition == false) {
			
			System.out.println("ERROR : contact does not exist !!!");
		}
		else {
			System.out.println("contact list updated ");
		}
		
	}
	
	private boolean deletecontact(String cname) {
		int index = findcontact(cname);
		if(index == -1) {
			return false;
		}
		else {
			contactlist.remove(index);
			return true;
		}
	}
	
	private int findcontact(String name) {
		
		for(int i = 0; i<this.contactlist.size(); i++) {
			if(contactlist.get(i).getContactname().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
}
