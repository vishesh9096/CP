import java.util.Scanner;

public class ArrayRecovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            long d[] = new long[n];
            for(int i=0;i<n;i++)
                d[i] = sc.nextInt();
            a[0] = d[0];
            int flag=0;
            for(int i=1;i<n;i++)
            {
                a[i] = a[i-1]+d[i];
                if(d[i]-a[i-1]>a[i-1]) flag=1;
                
            }
            if(flag==1)
             System.out.print(-1);
             else
                for(int i=0;i<n;i++)
                    System.out.print(a[i] +" ");
            System.out.println();


        }
    }
}
