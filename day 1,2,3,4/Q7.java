/*
 * Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99
 */
public class Q7 {

	public static void main(String[] args) {
		int i;
		for( i=1;i<=99;i++) {
			if(i%2!= 0) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
		}

	}

}
