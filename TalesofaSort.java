import java.util.Scanner;

public class TalesofaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int a[]  = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int c=0;
            for(int i=n-1;i>0;i--)
            {
                if(a[i]>=a[i-1]) c++;
                else break;
            }
            int e = n-c;
            if(c==n-1) System.out.println(0);
            else{
            int max = 0;
            for(int i=0;i<e;i++)
            {
                if(a[i]>max) max = a[i];
            }
            System.out.println(max);
        }
        }
    }
}
