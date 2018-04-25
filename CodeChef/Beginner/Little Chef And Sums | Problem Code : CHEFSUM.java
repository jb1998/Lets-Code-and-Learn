import java.util.*;
import java.lang.*;
import java.io.*;

    class ChefSum {

        public static void main(String args[]){

            Scanner s=new Scanner(System.in);
            int t=s.nextInt();

            for(int a=0;a<t;a++){

                int size=s.nextInt();
                int array[]=new int[size];

                //storing array...
                for(int b=0;b<size;b++){
                    array[b]=s.nextInt();
                }

                int minSum=0,ithValue=0;

                for(int i=1;i<=size;i++){
                    int sumOfI=0,prefix=0,suffix=0;
                    int j;
                    for(j=0;j<i;j++){
                        prefix+=array[j];

                    }
                    //System.out.println("Prefix of "+i+" = "+prefix);
                    for(j=i-1;j<size;j++){
                        suffix+=array[j];
                    }
                    //System.out.println("Suffix of "+i+" = "+suffix);


                    sumOfI=prefix+suffix;
                    //System.out.println("Sum of "+i+" = "+sumOfI);
                    if(i==1){
                        minSum=sumOfI;
                        ithValue=1;
                    }
                    if(sumOfI<minSum){
                        minSum=sumOfI;
                        ithValue=i;
                    }
                //System.out.println("minsum = "+minSum);
                }

                System.out.println(""+ithValue);
            }
        }

    }
