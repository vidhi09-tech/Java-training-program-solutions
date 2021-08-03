/*
 * Return last digit of the given number
Write a function that returns the last digit of the given number.*
Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the
given number.
 */
import java.util.*;
class number{
	int num;
	int last() {
		int s = num%10;
		return s;
	}
}
public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		number digit = new number();
		digit.num = sc.nextInt();
		int value = digit.last();
		System.out.println("last digit of the number is:" +value);

	}

}
