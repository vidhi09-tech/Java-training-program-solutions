/*
 * IS PALINDROME POSSIBLE?
 * Write a function to find whether it is possible to get a palindrome number
 * from a given number by re arranging the position of its digits . If yes the function should 
 * return 2, else it must return 1.
 * Example : if the number is 21251 it is possible to form a palindrome by re arranging its digits
 * as 21512 or 12521. so the function must return 2.
 * example 2: if the given number is 2125 it is not possible to form a palindrome by reaaranging its digits.'
 * so the function return 1.
 */
import java.util.*;
class B{
	int n, rem,sum=0;
	int k;
	 int i , odd=0;
	int A[] = {0,0,0,0,0,0,0,0,0};
	
	int palindrome() {
		
	    while(n>0){
	        A[n%10]++;
	        n = n /10;
	    }
	    
	   
	    for(i=0;i<A.length;i++){
	        if(A[i]&1)
	        odd++; 
	        if(odd>1)
	        return 1;
	    }
	    return 2;
		
	}
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	B exact = new B();
    	exact.n =sc.nextInt();
    	int s = exact.palindrome();
    	System.out.println(exact.n); // main value
    	System.out.println(exact.sum); // reversed value
    	System.out.println(exact.k); // stored value
    	System.out.println(s);

	}

}
