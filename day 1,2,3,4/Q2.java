/*
 * Write a program to accept a number N and print whether it is positive, negative or zero
 */

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any positive, negative or 0 number");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("number is positive");
		}
		else if(n<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("it is zero");
		}
		}
		

	
	

}
