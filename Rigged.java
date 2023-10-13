import java.util.Scanner;

public class Rigged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            int end[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                end[i] = sc.nextInt();
            }
            int maxw = a[0];
            int maxrep = end[0];
            int falg=0;
            for(int i=1;i<n;i++)
            {
                if(a[i]>=maxw&&end[i]>=maxrep)
                {
                    
                    falg=1;
                    break;
                }

            }
            if(falg==0) System.out.println(maxw);
            else  System.out.println("-1");


        }
    }
}
