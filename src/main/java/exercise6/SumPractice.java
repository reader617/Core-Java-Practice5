package exercise6;

import java.util.Scanner;

public class SumPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value to test: ");
		int test = input.nextInt();

		int answer = sum(test);
		System.out.println("The sum of the numbers is: " + answer);
		input.close();
	}

	public static int sum(int n) {
		return (n * (n + 1)) / 2;

	}
}
