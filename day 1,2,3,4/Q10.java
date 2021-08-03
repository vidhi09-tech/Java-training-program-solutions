/*
 * Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85
82 79. . . 22 19 16 13 10 7 4 1
 */

public class Q10 {

	public static void main(String[] args) {
		int i;
		for(i = 100 ; i>=1 ;i= i-3) {
			System.out.println(i);
		}

	}

}
