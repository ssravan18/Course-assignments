package assign;

import java.util.Scanner;

public class Last_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		String[] parts = input.split(" ");
		for(String st : parts) {
			if(st.length() == 0) continue;
			Character ch = st.charAt(st.length()-1);
			if(Character.isLetter(ch)) {
				result += ch;
			}
		}
		System.out.println(result);
	}

}
