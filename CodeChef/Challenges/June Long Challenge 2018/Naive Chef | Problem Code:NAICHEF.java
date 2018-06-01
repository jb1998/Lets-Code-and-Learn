import java.util.*;
import java.lang.*;
import java.io.*;

class NaiChef{
   public static void main(String[] args) {

     Scanner s=new Scanner(System.in);
         int t=s.nextInt();

         for(int i=0;i<t;i++){

             int n=s.nextInt();
             int a=s.nextInt();
             int b=s.nextInt();
             float countA=0,countB=0;

             for(int j=0;j<n;j++){
                 int temp=s.nextInt();
                 if(temp==a)
                     countA=countA+1;
                 if(temp==b)
                     countB=countB+1;
             }

             float prob=(countA/n)*(countB/n);
             System.out.println(prob);
         }
  }

}
