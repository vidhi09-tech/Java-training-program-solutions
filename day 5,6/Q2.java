/*
 * Of the given 5 numbers, How many are even?
 * write a function that accepts 5 input parameters and returns the count of how many of those 5 are even
 *  for example:
 * if the 5 input parameters are 12,17,19,14 and 115 there are two even numbers 12 and 14. so the function must return2
 * now, if the 5 input parameters are 15,0,-12,19,28 then there are 3 even numbers.. 0,-12,28. so the
 * function must return 3.
 * observe that 0 is considered an even number.
 */
import java.util.*;
class even{
	int n1, n2, n3,n4,n5;
	int c= 0;
	int how() {
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
		return c;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		even exact = new even();
		exact.n1 = sc.nextInt();
		exact.n2 = sc.nextInt();
		exact.n3 = sc.nextInt();
		exact.n4 = sc.nextInt();
		exact.n5 = sc.nextInt();
		int value = exact.how();
		System.out.println(value);

	}

}
