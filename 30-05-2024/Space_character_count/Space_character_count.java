package assign;

import java.util.Scanner;

public class Space_character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] parts = input.split(" ");
		int x =(parts.length - 1);
		System.out.println("No of spaces : "+ x + " and characters : "+(input.length() - x));
	}

}
