package assign3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class List_Strings_Uc_to_Lc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringlist = new ArrayList<>();
		stringlist.add("Sravan");
		stringlist.add("Priya");
		stringlist.add("Mahesh Babu");		
		stringlist.add("Sudheer Babu");
		System.out.println(stringlist);
		
		List<String> Uppercase = stringlist.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(Uppercase);
		
		List<String> Lowercase = stringlist.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(Lowercase);
	}

}
