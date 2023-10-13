import java.util.Scanner;

public class PlusMinusPermutation {
    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static long lcm(long a, long b)
    {
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            long n = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long cntx=n/x,cnty=n/y,cntall=n/lcm(x,y);
            long ans=0,min=0,max=n;
         
            cntx-=cntall;
            cnty-=cntall;
            long r=n,l=n-cntx+1;
            ans+=(r * (r + 1) - l * (l - 1)) / 2;
           
            l=1;r=cnty;
            ans-=(r * (r + 1) - l * (l - 1)) / 2;
            
            System.out.println(ans);
        }
    }
}
