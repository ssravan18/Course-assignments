package assign3;

import java.util.*;

public class Array_to_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Sravan", "Ram", "Arjun", "priya"};
		System.out.println(Arrays.toString(names));
		List<String> namesList = new ArrayList<>(Arrays.asList(names));
		namesList.add("Kavya");
		namesList.add(4,"Yesh");
		System.out.println(namesList);
		
		ListIterator ltr = namesList.listIterator();
		
		while(ltr.hasNext()) {
			Object ob = ltr.next();
			System.out.println(ob);
		}
	}

}
