/*
 * Factorial of a number
 * n!
 * 5! = 5*4*3*2*1 = 120
 * 
 */
import java.util.*;
class C{
	int n,i,f=1;
	int factorial() {
		for(i=n;i>=1;i--) {
			f= f*i;
		}
		return f;
	}
}
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C exact = new C();
		exact.n = sc.nextInt();
		System.out.println(exact.factorial());
	}

}
