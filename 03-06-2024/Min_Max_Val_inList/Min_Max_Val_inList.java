package assign3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Min_Max_Val_inList {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(50);
		lst.add(90);
		System.out.println(lst);
		System.out.println("the maximum value in list :: "+Collections.max(lst));
		System.out.println("the minimum value in list :: "+Collections.min(lst));
	}
}
