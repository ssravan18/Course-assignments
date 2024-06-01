package assign;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		input = input.toLowerCase();
		
		for(int i=input.length()-1;i>=0;i--) {
			result += input.charAt(i);
		}
		System.out.println(result);
	}
}
