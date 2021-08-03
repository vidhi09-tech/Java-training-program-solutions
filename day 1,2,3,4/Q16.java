/*
 * Sum of last digits of two given numbers
Rohit wants to add the last digits of two given numbers.
For example,
If the given numbers are 267 and 154, the output should be 11.
Below is the explanation -
Last digit of the 267 is 7
Last digit of the 154 is 4
Sum of 7 and 4 = 11
Write a program to help Rohit achieve this for any given two numbers.
The prototype of the method should be -
Logic Building Hour (LBH) Plan
Sensitivity: Internal & Restricted
int addLastDigits(int input1, int input2);
where input1 and input2 denote the two numbers whose last digits are to be added.
Note: The sign of the input numbers should be ignored.
i.e.
if the input numbers are 267 and 154, the sum of last two digits should be 11
if the input numbers are 267 and -154, the sum of last two digits should be 11
if the input numbers are -267 and 154, the sum of last two digits should be 11
if the input numbers are -267 and -154, the sum of last two digits should be 11

 */
import java.util.*;
class num{
	int x,y;
    void addLastDigits(int input1, int input2) {
    		x = input1;
    		y = input2;
    	
    }
    int getData()  {
    	int s,v, a;
    	if(x<0) {
    		x = x*-1;
    	}
    	if(y<0) {
    		y = y*-1;
    	}
    	if(x<0 && y<0) {
    		x = x*-1;
    		y= y*-1;
    	}
		s = x %10;
		v = y %10;
		a = s+v;
		System.out.println("input1 value: " +x);
		System.out.println("input2 value: " +y);
		return a;
    }
    
}
public class Q16 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	num add = new num();
	add.x = sc.nextInt();
	add.y = sc.nextInt();
	
	int value = add.getData();
	
	System.out.println(" after adding both the values:" +value);
	}
}
