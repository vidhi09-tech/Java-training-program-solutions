/*
 * Write a program to accept two numbers and print whether their sum is EVEN or ODD
 */
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = n+m;
		if(sum%2==0) {
			System.out.println("number is even " +sum);
		}
		else {
			System.out.println("number is odd "+sum);
		}

	}

}
