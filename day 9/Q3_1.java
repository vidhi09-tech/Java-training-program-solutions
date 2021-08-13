/* CREATE PIN USING 3 GIVEN INPUT NUMBERS
 * "Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). You have been asked to work on the module that is expected to generate PINs using three input numbers. 
Assumptions: The three given input numbers will always consist of three digits each i.e. each of them will be in the range >=100 and <=999
100 <= input1 <= 999
100 <= input2 <= 999
100 <= input3 <= 999
Below are the rules for generating the PIN -
- The PIN should be made up of 4 digits
- The unit (ones) position of the PIN should be the least of the units position of the three input numbers
- The tens position of the PIN should be the least of the tens position of the three input numbers
- The hundreds position of the PIN should be the least of the hundreds position of the three input numbers
- The thousands position of the PIN should be the maximum of all the digits in the three input numbers
Example 1 -
input1 = 123
input2 = 582
input3 = 175
then, PIN = 8122
Example 2 -
input1 = 190
input2 = 267
input3 = 853
then, PIN = 9150
 * 
 */
import  java.util.*;
public class Q3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int arr[]={input1,input2,input3};
	    int max=0,min;
	    double sum=0.0;
	    double place=1.0;
	    int num;
	    for(int i=0;i<3;i++)
	    {
	        num=arr[i];
	        while(num!=0)
	        {
	          int r=num%10;
	            if(r>max)
	                max=r;
	            num=num/10;
	        }
	    }
	    for(int i=0;i<3;i++)
	    {
	         min=99;
	          for(int j=0;j<3;j++)
	          {
	              int rem=arr[j]%10;
	              if(rem<min)
	                min=rem;
	                arr[j]/=10;
	          }
	          sum=(min+(sum/place));
	          sum*=place;
	          place*=10;
	    }
	     int c = (int)(max*1000+sum);
	     System.out.println(c);
	    }
	

	}


