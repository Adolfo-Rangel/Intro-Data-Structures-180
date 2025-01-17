package assignment2;
import java.util.Scanner;
public class assignment2main {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter Numbers");
		
		for (int i = 0; i < 5; i++) 
		{	
			int myNum = myScanner.nextInt();
			numbers[i] = myNum;
		}
		
		myScanner.close();
		
		database mydatabase = new database(numbers);
		
		numbers = mydatabase.bubbleSort();
		mydatabase.printDbnums();
		
		
		}
		

	}


