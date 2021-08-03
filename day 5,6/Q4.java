/*
 * Of the given 5 numbers, How many are even or odd?
 * Write a function that accepts 6 input parameters.
 * the first 5 input parameters are of type int.
 * the sixth parameter is of type string.
 * if the 6th parameter contains the value "even", the function is supposed to return count of how
 * many of the first five input parameters are even.
 * if the 6th parameter contains the value "odd", the function is supposed to return count of how
 * many of the first five input parameters are odd.
 * For example,
If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "odd",
the function must return 3 because there are three odd numbers 17, 19, and 115.

If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "even", the
the function must return 2 because there are two even numbers 12 and 14.

Note that zero is considered an even number.
 */
import java.util.*;
class A{
	int n1,n2,n3,n4,n5;
	String n6;
	int c = 0;
	int OddEven() {
		
			if(n1%2==0)
				c++;
			if(n2%2==0)
				c++;
			if(n3%2==0)
				c++;
			if(n4%2==0)
				c++;
			if(n5%2==0)
				c++;
			if(n6.equals("even"))
			return c;
			else
				return 5-c;
		
		
		
	}
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A exact = new A();
		exact.n1 = sc.nextInt();
		exact.n2 = sc.nextInt();
		exact.n3 = sc.nextInt();
		exact.n4 = sc.nextInt();
		exact.n5 = sc.nextInt();
		System.out.println(" enter odd or even");
		exact.n6 = sc.next();
		
		System.out.println("the total numbers: " +exact.OddEven());
		

	}

}
