package exercise3;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBraces {

	public static void main(String[] args) {
		boolean balance;
		String test;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to test: ");
		test = input.nextLine();
		balance = isBalanced(test);
		if (balance) {
			System.out.println("The string is balanced!");
		} else {
			System.out.println("The string is not balanced!");
		}
		input.close();

	}

	public static boolean isBalanced(String input) {
		Stack<String> balance = new Stack<>();
		String temp;
		for (int i = 0; i < input.length(); i++) {
			temp = input.substring(i, i + 1);
			if (temp.equals("{") || temp.equals("(") || temp.equals("[") || temp.equals("<")) {
				balance.push(temp);
			}
			if (!balance.isEmpty()) {
				if (temp.equals("}") && balance.peek().equals("{")) {
					balance.pop();
				} else if (temp.equals(")") && balance.peek().equals("(")) { 
					balance.pop();
				} else if (temp.equals("]") && balance.peek().equals("[")) {
					balance.pop();
				} else if (temp.equals(">") && balance.peek().equals("<")) {
					balance.pop();
				}
			} /*else {
				return false;
			}*/ // The above commented out code can be used if the only input being tested is 
			// a sequence of braces. However if test cases using other values (like a mathematical
			// expression with numeric values) are entered it must remain commented out or the algorithm could fail.
		}
		if (balance.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
