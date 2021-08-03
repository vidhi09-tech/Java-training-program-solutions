/*
 * UNIQUE DIGITS COUNT(repetitive)
 * Write a function to find the count of unique digits in a given number N. 
 * ex: - if the given number is 292, the function should return 2 because there are only 2 unique
 * digits 2 and 9.
 */
import java.util.*;
class D{
	int temp,i,c=0;
	int hash[]={0,0,0,0,0,0,0,0,0,0};
	int input1;
	int digitcount() {
		while(input1>0){
			temp = input1%10;
			if(hash[temp]==0) {
				hash[temp]=1;
				c++;
			}
			input1 = input1/10;
			
		}
		

		return c;
	}
}
public class Q3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D exact = new D();
		exact.input1 = sc.nextInt();
		System.out.println(exact.digitcount());

	}

}
