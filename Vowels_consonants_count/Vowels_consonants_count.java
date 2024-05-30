package assign;

import java.util.*;

public class Vowels_consonants_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String input = Sc.nextLine();
		input = input.toLowerCase();
		int vowelscount=0, consonantscount=0;
		
		String vowels = "aeiou";
		
		for(char ch : input.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch) != -1) vowelscount+=1;
				else consonantscount+=1;
			}
		}
		System.out.println("Vowels count - "+vowelscount);
		System.out.println("Consonants count - "+consonantscount);
	}

}
