/*
  Is Even?
Write a function to find whether the given input number is Even.
If the given number is even, the function should return 2 else it should return 1.
Note: The number passed to the function can be negative, positive or zero. Zero should be treated as
Even.
 */
import java.util.*;
class even{
	int num;
	void even1(int x) {
		num = x;
	}
	int evenCheck() {
		if(num%2==0)
			return 2;
		else
			return 1;
	}
}
public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value;
		even check = new even();
		System.out.println("input a number to check");
		check.num=sc.nextInt();
		value = check.evenCheck();
		System.out.println(value);
		

	}

}
