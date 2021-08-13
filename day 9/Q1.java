/*
 * IS palindrome number
 * write a function to find whether the given number N is a palinfrome.
 * Ex - 252... 
 * The number will be passed to the function as an input parameter of typr int.
 * If the number is a palindrome the function should return 2 else it should 
 * return 1.
 * 
 */
import java.util.*;
class A{
	int n, rem,sum=0;
	int k;
	int palindrome() {
		k =n;
		while(n!=0) {
			rem = n%10;
			sum = sum * 10 +rem;
			n = n/10;
		}
		if(k == sum) {
			return 2;
		}
		else
			return 1;
		
	}
}
public class Q1 {
        
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	A exact = new A();
    	exact.n =sc.nextInt();
    	int s = exact.palindrome();
    	System.out.println(exact.n); // main value
    	System.out.println(exact.sum); // reversed value
    	System.out.println(exact.k); // stored value
    	System.out.println(s);
        
    }
}