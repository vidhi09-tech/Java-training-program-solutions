/*
 * Nth prime 
 * if the given number N is 10, the method must return the 10th prime number i.e 29
 */
import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,c=0;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0)
					c++;
			}
		}
       if(c==2)
    	   System.out.println("prime number" +i);
	}

}
