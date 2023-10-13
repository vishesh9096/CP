import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingSmallestMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s =sc.nextLine();
            s="c"+s;
            long dp[] = new long[s.length()+1];
            long cost=0;
            for(long i=1;i<=n;i++)
            {
                if(s.charAt((int)i)=='0')
                {
                    for(long j=i;j<=n;j+=i)
                    {
                        if(s.charAt((int)j)=='1') break;
                        if(dp[(int)j]==1) continue;
                        cost+=i;
                        dp[(int)j]=1;
                    }
                }

            }  

            System.out.println(cost);
          
        }
    }
}
