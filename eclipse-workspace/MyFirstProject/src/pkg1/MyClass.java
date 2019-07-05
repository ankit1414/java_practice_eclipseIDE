package pkg1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int input_by_user = scan.nextInt();
		System.out.println("The entered number was : ");
		System.out.println(input_by_user);
		System.out.println("enter a string and we will display the 1st character");
		scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		System.out.print("The first character is : "+ c);

	}

}
