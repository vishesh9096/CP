import java.util.Scanner;

public class PlayinginaCasino{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m+1];

            for(int i=0;i<n;i++)
            {
                int temp=0;
                for(int j=0;j<m;j++) {   a[i][j] = sc.nextInt();
                    temp+=a[i][j];
                }
                a[i][m] = temp;
            }
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int k=i+1;k<n;k++){
                for(int j=0;j<m;j++)
                {
                    sum+=Math.abs(a[i][j]-a[k][j]);

                }
            }
            }
            System.out.println(sum);

        }
    }
}