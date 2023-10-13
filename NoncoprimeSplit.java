import java.util.Scanner;

public class NoncoprimeSplit {
    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }
    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            long l = sc.nextInt();
            long r = sc.nextInt();
           
           int flag=0;

           for(long i=l;i<=r;i++)
           {
            if(i==1) continue;
            if(!isPrime(i)) {
                flag=1;
                break;
            }
           }

           if(flag==0) System.out.println("-1");
           else{
            long a=(r)/2;
            if(r%2!=0) a--;
            long b = r-a;
            // while(gcd(a,b)==1)
            // {
            //     a++;
            //     b--;
            // }


            System.out.println(a+" "+b);
           }
            
        }
    }
}
