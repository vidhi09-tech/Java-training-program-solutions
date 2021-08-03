/*
 Return second last digit of the given number
Write a function that returns the second last digit of the given number.
Second last digit is being referred to the digit in the tens place in the given number.
for example,
if the given number is 197, the second last digit is 9
Note1 - The second last digit should be returned as a positive number.
i.e. if the given number is -197, the second last digit is 9
Note2 - If the given number is a single digit number, then the second last digit does not exist. In such
cases, the function should return -1.
i.e. if the given number is 5, the second last digit should be returned as -1
 */
import java.util.*;
class number1{
	int num;
	int last() {
		int s,v,q;
		s = num%10;
		num = num/10;
		if(num == 0) {
			return -1;
		}
		else {
			if(num<0) {
				num = num*-1;
				q = num%10;
				return q;
			}
			else {
				v = num%10;
				return v;
			}
		}
		
	}
}
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		number1 digit = new number1();
		digit.num = sc.nextInt();
		int value = digit.last();
		System.out.println("last digit of the number is:" +value);


	}

}
