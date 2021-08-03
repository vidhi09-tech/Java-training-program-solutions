/*
 * ALL DIGITS COUNT
 * Write a function to find all digits in a given number N. 
 * Ex - if the given number is 292, the function should return 3 as there are 3 digits.
 * 
 */
import java.util.*;
class B{
	int n,rem,count=0;
	int count() {
		while(n!=0) {
			rem = n%10;
			count++;
			n= n/10;
		}
		return count;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B exact = new B();
		exact.n = sc.nextInt();
		System.out.println(exact.count());

	}

}
