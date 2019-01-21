import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);

	    int t=s.nextInt();
	    int arr[]=new int[t];
	    for(int i=0;i<t;i++){
	        int n= s.nextInt();
	        arr[i]=n;
	    }

	    Arrays.sort(arr);

	    for(int j=0;j<t;j++){
	        System.out.println(""+arr[j]);
	    }

	}
}
