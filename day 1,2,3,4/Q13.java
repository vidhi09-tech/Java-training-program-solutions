/*
 Is Odd?
Write a function to find whether the given input number is Odd.
If the given number is odd, the function should return 2 else it should return 1.
Note: The number passed to the function can be negative, positive or zero. Zero should NOT be
treated as odd.
 */
import java.util.Scanner;
class odd{
	int num;
	int oddCheck() {
		if(num%2!=0) {
			System.out.println("Odd");
			return 2;
		}
		else
			return 1;
	}
}
public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value;
		odd check = new odd();
		System.out.println("input a number to check");
		check.num=sc.nextInt();
		value = check.oddCheck();
		System.out.println(value);
		

	}

}
