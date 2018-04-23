import java.util.*;
import java.lang.*;
import java.io.*;

class Demo
{
	public static void main (String[] args) 
	{
		int n,k,t,output=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();

		for(int I=0;I<n;I ++){
		t=s.nextInt();
		if(t%k==0)
		output+=1;

			}
			System.out.println(output);

	}
}
