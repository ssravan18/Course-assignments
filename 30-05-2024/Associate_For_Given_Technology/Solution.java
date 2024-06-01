package assign;

import java.util.*;

public class Solution {
	
	public static int[] associatesForGivenTechnology(Associate[] employees, String targetTech) {
		ArrayList<Integer> resultlist = new ArrayList<>();
		for(Associate emp : employees) {
			if(emp.Technology.equals(targetTech) && emp.Experience%5 == 0) {
				resultlist.add(emp.id);
			}
		}
		int[] result = resultlist.stream().mapToInt(i -> i).toArray();
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		Associate emp[] = new Associate[5];
		
		for(int i=0;i<5;i++) {
			int id = Sc.nextInt();
			String name = Sc.nextLine();
			Sc.nextLine();
			String tech = Sc.nextLine();
			int exp = Sc.nextInt();
			emp[i] = new Associate(id, name, tech, exp);
		}
		Sc.nextLine();
		String givenTech = Sc.nextLine();
		int[] result = associatesForGivenTechnology(emp, givenTech);
		for(int i : result) {
			System.out.println(i);
		}
	}

}
