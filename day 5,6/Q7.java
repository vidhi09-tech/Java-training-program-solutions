/*
 * nth Fibonacci series
 * 0 1 1 2 3 5 8 13 21 34 55........................
 */
import java.util.*;
class D{
	int n,i;
	int fib(int n) {
		if(n==0) 
			return 0;
		if (n==1) 
			return 1;
		return fib(n-1) + fib(n-2);
		
			
	}
	void fib1() {
		for(i=0;i<n;i++)
			System.out.println(" " +fib(i));
	}
	
	}

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D exact = new D();
		exact.n = sc.nextInt();
		
		
		exact.fib1();
		

	}

}
