package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What's the first number?");
		int n1 = in.nextInt();
		Scanner inn = new Scanner(System.in);
		System.out.println("What's the second number?");
		int n2 = in.nextInt();
		
		double answer = (n1 + n2) / 2.0;
		System.out.println("The average is " + answer + ".");



	}

}
