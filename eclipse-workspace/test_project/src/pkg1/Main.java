package pkg1;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilephone = new MobilePhone();
	

	public static void main(String[] args) {
		
		String name , mobileno;
		boolean quit = false;
		
		
		
		
		while(!quit) {
			System.out.println("\n============================================================================");
			System.out.println("\npress 1 : to add contact"
					+ "\npress 2 : to display contacts"
					+ "\npress 3 : to delete contact"
					+ "\npress 4 : to modify contact"
					+ "\npress 5 : to exit");
			System.out.println("============================================================================\n");
			int input = scanner.nextInt();
			scanner.nextLine();
			
			switch(input) {
				
			
			case 1:
		
				System.out.print("enter contact name : ");
				name = scanner.nextLine();
				System.out.print("enter the mobile no : ");
				mobileno = scanner.nextLine();
				mobilephone.savecontact(Contacts.createcontact(name, mobileno));
				break;
			case 2 :
				mobilephone.printcontactlist();
				break;
			case 3 :
				System.out.print("Enter the contact name : ");
				name = scanner.nextLine();
				mobilephone.delete(name);
				break;
			case 4:
				System.out.print("Enter the contact name you want to modify :");
				name = scanner.nextLine();
				mobilephone.editcontacts(name);
				break;
				
			case 5:
				quit = true;
				System.out.println("GOOD BYE! HAVE A NICE DAY  (*_*)");
				break;
				
			default:
				System.out.println("INVALID INPUT !!! TRY AGAIN");
				break;
			}
		    
	
		}
	}

}
