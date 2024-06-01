package assign;

import java.util.*;

public class Unique_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		for(char ch : input.toCharArray()) {
			if(result.indexOf(ch) == -1) {
				result = result+ch;
			}
		}
		System.out.println(result);
	}

}
