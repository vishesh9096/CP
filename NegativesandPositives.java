import java.util.Arrays;
import java.util.Scanner;

public class NegativesandPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            long ne=0;
            long sum=0;
            long min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {a[i] = sc.nextInt();
               if(a[i]<0) {ne++;
                a[i] = -a[i];
            }
               sum+=Math.abs(a[i]);
               if(Math.abs(a[i])<min) min = Math.abs(a[i]);
            }
            
            if(ne%2==0)
                System.out.println(sum);
            else
            {
                System.out.println(sum-min*2);
            }

        }
    }
}
