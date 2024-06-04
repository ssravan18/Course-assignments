package assign3;

import java.util.ArrayList;
import java.util.List;

public class Even_odd_Sum {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(11);
		lst.add(32);
		lst.add(55);
		lst.add(70);
		System.out.println(lst);
		
		double oddsum = lst.stream().mapToInt(Integer::intValue).filter(n -> n%2 != 0).sum();
		System.out.println("the odd elements sum = "+oddsum);

		double evensum = lst.stream().mapToInt(Integer::intValue).filter(n -> n%2 == 0).sum();
		System.out.println("the even elements sum = "+evensum);
	}
}
