import java.util.*;
import java.lang.*;
import java.io.*;

class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int t=0;
  	Scanner s= new Scanner(System.in);
    t=s.nextInt();

    for (int i=0;i<t;i++ ) {
      // Read the numbers a and b.
			int a = s.nextInt();
			int b = s.nextInt();

			// Compute the sum of a and b.
			int ans = a + b;
			System.out.println(ans);

    }

	}
}
