package assign2;

import java.util.*;

public class Smallest_vowel_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String input = Sc.nextLine();
		input = input.toLowerCase();
		Character c = 'a';
		boolean flag = false;
		String vowels = "aeiou";
		
		for(char ch : input.toCharArray()) {
				if(vowels.indexOf(ch)!=-1 && vowels.indexOf(ch)<=vowels.indexOf(c)) {
					flag = true;
					c = ch;
			}
		}
		if(flag) System.out.println(c);
		else System.out.println("no Vowels in the given String");
	}

}
