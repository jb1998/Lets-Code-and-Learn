    import java.util.*;
    import java.lang.*;
    import java.io.*;


    class Demo
    {
    	public static void main (String[] args)
    	{
    		int withd=0;double initial=0.0;
    		Scanner s= new Scanner(System.in);
    		withd=s.nextInt();
    		initial=s.nextDouble();

    		if ((withd+0.50)>initial)
    		System.out.println(initial);
    		else if (withd%5==0)
    			System.out.println(""+(initial-withd-0.50));
    			else
    		System.out.println(initial);
    	}
    }
