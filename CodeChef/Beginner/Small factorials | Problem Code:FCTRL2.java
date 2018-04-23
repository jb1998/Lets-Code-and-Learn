import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while (t-->0)
        {
            int num=sc.nextInt();
            BigInteger f=fact(num);
            System.out.println(f);

        }
    }
    static BigInteger fact(int n)
    {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }


} 
