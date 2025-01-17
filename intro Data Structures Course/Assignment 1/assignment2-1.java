package assignment2;
import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner (System.in);

		database mydatabase = new database ();

			int numbers [] = new int [5];

			int key;

			System.out.println("Enter Numbers: ");

		for(int i = 0;i < numbers.length; i++) {

			numbers [i] = myScanner.nextInt();

		}
		//Ascending order
		Utility.quickSort(numbers, 0, numbers.length-1);
		
		for(int num : numbers)
			
			System.out.println("Quicksort Acending : " + num);
			System.out.println(" ");
		//end of descending order
		
		//Descending order
		
		Utility.quickDecend(numbers, 0, numbers.length-1);
		
		for(int num : numbers)
			
			System.out.println("Quicksort Decending : " + num);
		//end of descending order
		
			System.out.println("Min: "+ mydatabase.min(numbers));
			System.out.println("Max: "+ mydatabase.max(numbers));
			System.out.println("Sorted numbers ");

			mydatabase.bubbleSort(numbers);

		for(int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i]+" ");

		}

			System.out.print("\nAverage : "+ mydatabase.average(numbers));
			System.out.print("\nEnter number to search : ");

			key = myScanner.nextInt();

		int index = mydatabase.binarySearch(numbers, key);

		if(index == -1)System.out.println(key + " not found in the array");

		else System.out.println(key + " is found in the array at index : "+index);

		myScanner.close();

		}

}
