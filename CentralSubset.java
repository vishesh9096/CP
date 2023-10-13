import java.util.Scanner;

public class CentralSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int nums[][] = new int[n+1][n+1];
            for(int i=0;i<m;i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                nums[u][v] = 1 ;
            }
            int flag=0;
            
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(nums[i][j]>0)
                    {
                        for(int k=1;k<=n;k++)
                        {
                            // System.out.println(" edge "+i+" to"+k);
                            if(nums[j][k]>0)    nums[i][k]++;
                        }
                    }
                }
            }
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    // if(nums[i][j]>0)
                    //     {
                    //         System.out.println("1");
                    //         System.out.println(i);
                    //     flag=1;
                    //     break;
                    //     }
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println("");
                // if(flag==1) break;
                
            }
            if(flag==0)
            System.out.println("-1");
        }
    }
}
