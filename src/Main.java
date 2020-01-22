
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] listOfNumbers;
		int n = 0;
		
		System.out.print("Input the total of numbers: ");
		n = userInput.nextInt();
		listOfNumbers = new int[n];
		
		int i = 0;
		do {
			System.out.print("Input index-" + (i + 1) + ":");
			listOfNumbers[i] = userInput.nextInt();			i++;
		} while (i < n);
		
		fizzBuzz(listOfNumbers);
	}
	
	private static void fizzBuzz(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0 && numbers[i] % 5 ==0) {
				System.out.println(numbers[i] + " is Fizz Buzz");
			} else if (numbers[i] % 3 == 0) {
				System.out.println(numbers[i] + " is Fizz");
			} else if (numbers[i] % 5 == 0) {
				System.out.println(numbers[i] + " is Buzz");
			} else {
				System.out.println(numbers[i]);
			}
		}
	}
}
