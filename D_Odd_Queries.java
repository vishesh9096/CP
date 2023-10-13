import java.util.Scanner;

public class D_Odd_Queries
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int a[] = new int[n+1];
            int sum = 0;
            int dp[] = new int[n+1];
            dp[0] = 0;
             for(int i=1;i<=n;i++){ a[i] = sc.nextInt();
            sum+=a[i];
            dp[i] = sum;
            // System.out.print(dp[i]+" ");
            }
            
            int x = sum;
            for(int i=1;i<=q;i++)
            {
                
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                int temp  =sum-( dp[r]+dp[l+1])+k*l;
                
                if(temp%2!=0) System.out.println("YES");
                else System.out.println("NO");
                

            }
            
            
        }
    }
}