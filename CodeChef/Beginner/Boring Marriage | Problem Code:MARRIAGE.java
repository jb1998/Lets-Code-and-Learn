import java.util.*;
import java.lang.*;
import java.io.*;


class Marriage {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int diff=a-b;
        if(diff<0)
            System.out.println((-1)*diff);
        else
            System.out.println(diff);

    }

}
