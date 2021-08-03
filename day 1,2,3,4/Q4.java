/*
 * Write a program to accept a number N and print whether the number is EVEN or ODD
 */
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("number is even " +n);
		}
		else {
			System.out.println("number is odd "+n);
		}
	}

}
