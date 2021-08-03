/*
 * Write a program to accept two numbers and print the greater value of the two
 */
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give two numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m>n)
		{
			System.out.println("m is greater numebr " +m);
		}
		else {
			System.out.println("n is greater " +n);
		}
		 int c = (m>n)?m:n;
		 System.out.println("greater  number is " +c);

	}

}
