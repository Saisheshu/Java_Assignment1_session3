package session3_Assignments;

import java.util.Scanner;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x;
		System.out.println("Enter the Number:");
		Scanner scaner=new Scanner(System.in);
		x=scaner.nextInt();
		System.out.println("The Square Root of "+x+" = "+Math.sqrt(x));
		System.out.println("The Cube Root of "+x+" = "+Math.cbrt(x));

	}

}
