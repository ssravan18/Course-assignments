package assign3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Min_Max_streams {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(51);
		lst.add(30);
		lst.add(15);
		lst.add(26);
		System.out.println(lst);
		
		int max = lst.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("the Maximum Value = "+max);
		
		int min = lst.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("the Minimum Value = "+min);
	}
}
