/*
 * Is Prime?
 * Write a function that finds whether the given number N is prime or not. 
 * If the number is prime the function should return 2 else it must return 1.
 * Ex-1: if the number is 7 the method must return 2
 * if the number is 10 the method should return 1
 */
import java.util.*;
class B{
	int n,i;
	int c= 0;
	int prime() {
		for(i=1;i<=n;i++) {
			if(n%i==0)
				c++;
		}
		if(c==2) {
			System.out.println("prime no.");
			return 2;
			
		}
		else {
			System.out.println("not a prime no.");
			return 1;
			
		}
	}
}
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B exact = new B();
		exact.n= sc.nextInt();
		System.out.println(exact.prime());
	}

}
