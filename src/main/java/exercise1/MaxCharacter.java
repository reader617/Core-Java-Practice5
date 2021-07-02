package exercise1;

import java.util.HashMap;
import java.util.Scanner;

public class MaxCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxIndex;
		String test;
		System.out.println("Enter a string to test: ");
		test = input.nextLine();
		maxIndex = findMaxChar(test);
		System.out.println("The index of the maximum letter is " + maxIndex);
		input.close();
	}

	public static int findMaxChar(String input) {
		int max = 0;
		String temp;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			temp = input.substring(i, i + 1);
			if (!map.containsKey(temp)) {
				map.put(temp, 1);
			} else {
				Integer value = map.get(temp);
				value = value + 1;
				map.replace(temp, value);
			}
		}
		
		temp = input.substring(0, 1);
		Integer largest;
		largest = map.get(temp);
		for (int j = 1; j < input.length(); j++) {
			temp = input.substring(j, j + 1);
			if (largest.compareTo(map.get(temp)) < 0) {
				largest = map.get(temp);
				max = j;
			}
		}
		
		
		return max;
	}
}
