import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long sum = (n*(n+1)/2)-(n-k+1)*(n-k)/2;
            long presum = (k*(k+1))/2;
            if(sum<x) System.out.println("NO ");
            else {
                if(presum>x)
                    System.out.println("NO ");
                else System.out.println("YES ");
            }
                   
        }
    }
}
