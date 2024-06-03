package assign;

import java.util.Scanner;

public class Perfect_Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sqrt = (int)Math.sqrt(n);
		if(sqrt*sqrt == n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
