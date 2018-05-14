import java.util.*;
import java.lang.*;
import java.io.*;


class MinDeletions {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);

        int t=s.nextInt();

        for(int k=0;k<t;k++){

       int n=s.nextInt();

       int arr[]=new int[n];

       for(int i=0;i<n;i++){
            int no=s.nextInt();
            arr[i]=no;
       }

    /* find min and next min element
       */
     int min=Integer.MAX_VALUE,nextMin=Integer.MAX_VALUE,gcd=1,minDeletions=1000;
     boolean canBeGcd=false;
     for(int i=0;i<n;i++){
     if (arr[i] < min)
            {
                nextMin = min;
                min = arr[i];
            }

     else if (arr[i] < nextMin && arr[i] != min)
                nextMin = arr[i];

     }


     if(min==1||nextMin==1){
     gcd=1;
     minDeletions=0;
     }
     else if(min>1){
     for(int i=2;i<=min;i++){
         for(int j=0;j<n;j++){
         if(arr[j]%i==0)
             canBeGcd=true;
         else{
             canBeGcd=false;
             break;
         }
         }
         if(canBeGcd)
             gcd=i;
     }
     }
     else if(min==0 && nextMin>1){
         for(int i=2;i<=nextMin;i++){
             for(int j=0;j<n;j++){
             if(arr[j]==0)
                 continue;
             else{
              if(arr[j]%i==0)
             canBeGcd=true;
         else{
             canBeGcd=false;
             break;
         }
             }


             }
              if(canBeGcd)
             gcd=i;
         }

     }

     if(gcd>1)
         minDeletions=-1;
     else if(gcd==1)
         minDeletions=0;

     System.out.println(minDeletions);


}

}
}
