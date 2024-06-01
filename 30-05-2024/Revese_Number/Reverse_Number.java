package assign;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0, result=0;
		while(num>0) {
			temp = num%10;
			result = result*10 + temp;
			num = num/10;
		}
		System.out.println(result);
	}

}
