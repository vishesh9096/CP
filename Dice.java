import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long dp[]  = new long[(int)n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(j>i) break;
                dp[i] = dp[i-j]+dp[i];

            }
        }
        System.out.println((dp[n])%(1000000007);

    }
}
