import java.util.*;
import java.lang.*;
import java.io.*;

class Demo
{
	public static void main (String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();

		for(int x=1;x<=t;x++){

			String str= s.next();
			int a=str.length();
			int snakes=0,m=0;int y;
			for(y=0;y<a;y++){
				char p=str.charAt(y);
				if(p=='s')
					snakes+=1;
					else if(p=='m')
						m=m+1;
				}

				for(y=0;y<a-1;y++){
					char p=str.charAt(y);
					char q=str.charAt(y+1);

					if((p=='s'&&q=='m')||(p=='m'&&q=='s')){
						snakes-=1;
						y++;}

					}


				if(m>snakes)
				System.out.println("mongooses");
				else if(m==snakes)
				System.out.println("tie");
				else if(snakes>m)
    	System.out.println("snakes");

				}

	}
}
