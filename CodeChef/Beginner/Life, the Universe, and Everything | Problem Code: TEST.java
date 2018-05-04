import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s= new Scanner(System.in);
		
		ArrayList<Integer> nos = new ArrayList<Integer>();
		do{
		int no=s.nextInt();
		nos.add(no);
		}while(s.hasNextInt());
		
		for(int no:nos){
		if(no==42)
		break;
		else
		System.out.println(no);
		
		}
		
		
		
    }
} 
