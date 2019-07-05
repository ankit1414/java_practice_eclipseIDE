package arrays_learning;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//array and string are reference value;
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			
			arr[i] = scanner.nextInt();
			//scanner.nextLine();
		}
		
		int[] newarray = Arrays.copyOf(arr , arr.length);
		
		newarray[9] = 10;
		System.out.println("arr = " + Arrays.toString(arr));
		
		System.out.println("newarray = " + Arrays.toString(newarray));

	}

}
