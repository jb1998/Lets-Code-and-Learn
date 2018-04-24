import java.util.*;
import java.lang.*;
import java.io.*;

class SumOfDigits {

    public static void main (String[] args)
  {

   Scanner s= new Scanner(System.in);
   int t=s.nextInt();

  for (int i=0;i<t;i++ ) {

    int no=s.nextInt();
    int sum=0,len=0;
    String str=""+no;
    len=str.length();

    while(no!=0){
      sum+=no/Math.pow(10,len-1);
      no=(int) (no%Math.pow(10,len-1));
      str=""+no;
      len=str.length();
    }
    System.out.println(sum);



    }
  }
}
