/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();

		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    int c=s.nextInt();

		    int sum=0;
		    for(int j=0;j<n;j++){
		        int a=s.nextInt();
		        sum+=a;
		    }
		    if(c>=sum)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}




	}
}
