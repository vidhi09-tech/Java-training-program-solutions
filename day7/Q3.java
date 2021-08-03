/*
 * UNIQUE DIGITS COUNT(Non - repetitive)
 * Write a function to find the count of unique digits in a given number N. 
 * ex: - if the given number is 292, the function should return 2 because there are only 1 unique
 * digits 9.
 */
import java.util.*;
class C{
	int temp,i,c=0;
	int hash[]={0,0,0,0,0,0,0,0,0,0};
	int input1;
	int digitcount() {
		while(input1>0){
			temp = input1%10;
			hash[temp]++;
			input1 = input1/10;
			
		}
		for(i=0;i<hash.length;i++){
			if(hash[i]==1)
			c++;
		}

		return c;
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C exact = new C();
		exact.input1 = sc.nextInt();
		System.out.println(exact.digitcount());

	}

}
