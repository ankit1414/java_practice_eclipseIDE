package arraysorting;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] intarray = getarray(10);
		intarray = sortarray(intarray);
		displayarray(intarray);
		

	}
	public static int[] getarray(int sz) {
		int[] arr = new int[sz];
		System.out.println("getarray method called ::: \nenter the elements of the array(10)::");
		for(int i = 0 ; i < sz ; ++i) {
			arr[i] = scanner.nextInt();
		}
		return arr;
		
	}
	public static int[] sortarray(int[] arr) {
		System.out.println("sorting the array...............");
		//int[] temparray = new int[arr.length];
		for(int i = 0; i<arr.length ; ++i) {		//bubble sort:
			for(int j = 0 ; j<arr.length-1 - i ; ++j) {
				if(arr[j] < arr[j +1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
	public static void displayarray(int[] arr) {
		System.out.println("the sorted array is ::");
		for(int i = 0 ; i < arr.length ; ++i ) {
			System.out.print(arr[i] + " ");
		}
	}
}
