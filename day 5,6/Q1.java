/*
 * Is N an exact multiple of M
 * Write a function that accepts two parameters and find whether the first parameter is an exact multiple of second parameter.
 * if the first parameter is an exact multiple of the second parameter the function should return 2 else it should
 * return 1.
 * if either of the parameters are zero, the function should return 3.
 * assumption:
 * within the scope of this question assume that
 * the 1st parameter can be +ve, -ve, or 0
 * the 2nd parameter will always be >=0.
 */
import java.util.*;
class multiple{
	int n,m;
	int mul() {
		if(n == 0 || m == 0)
			return 3;
		else if(n%m == 0)
			return 2;
		else
			return 1;
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		multiple exact = new multiple();
		exact.n = sc.nextInt();
		exact.m = sc.nextInt();
		int value = exact.mul();
		System.out.println(value);
	}

}
