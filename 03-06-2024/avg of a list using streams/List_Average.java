package assign3;

import java.util.ArrayList;
import java.util.List;

public class List_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>();
		lst.add(11);
		lst.add(32);
		lst.add(50);
		lst.add(70);
		System.out.println(lst);
		
		double avg = lst.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
		System.out.println("the average of elements in List :: "+avg);
	}

}
