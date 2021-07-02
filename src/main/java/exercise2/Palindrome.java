package exercise2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String test;
		boolean p;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to test: ");
		test = input.nextLine();
		p = isPalindrome(test);
		if (p) {
			System.out.println("The string is a palidrome!");
		} else {
			System.out.println("The string is not a palindrome!");
		}
		input.close();

	}

	public static boolean isPalindrome(String input) {
		int begin = 0;
		int end = input.length() - 1;
		while (begin < end) {
			if (input.charAt(begin) != input.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}

}
