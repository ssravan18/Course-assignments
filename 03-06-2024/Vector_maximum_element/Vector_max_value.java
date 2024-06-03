package assign3;

import java.util.Scanner;
import java.util.Vector;

public class Vector_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the Size of vector ::");
		int n = sc.nextInt();
        Vector<Integer> v = new Vector<Integer>(n);
        
        System.out.println("Enter the numbers in vector");
        for (int i = 1; i <= n; i++) {
        	int val = sc.nextInt();
        	v.add(val);
        }

        int max = 0;
        for (int i = 0; i < v.size(); i++) {
        	if(max<v.get(i)) {
        		max = v.get(i);
        	}
        }
        System.out.println("the max Element is :: "+max);
	}

}
