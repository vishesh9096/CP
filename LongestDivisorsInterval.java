import java.math.BigInteger;
import java.util.Scanner;

public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int e=0;e<t;e++){
        long n = sc.nextLong();
        long max=0;
        long count=0;
        if(n%2!=0) System.out.println(1);
        else
        {
        long pdt=1;
        for(long i=1;i<10000;i++)
        {
            if(count>max) max = count;
            if(n%i==0) {count++;
                }
            else{

                count=0;
            }
            

        }
        if(count>max) max = count;
        System.out.println(max);
        }
        }
    }
    
}
