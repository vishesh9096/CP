import java.util.Scanner;

public class YetAnotherPermutationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            int ans[] = new int[n+1];
            for(int i=1;i<=n;i++)
            {
                if(i<=2) {ans[i] =i;
                a[i]=1;}
                else{
                    if(ans[i-1]*2<=n&&a[ans[i-1]*2]==0)
                    {
                        ans[i] = ans[i-1]*2;
                        a[ans[i-1]*2]=1;
                    }
                    else{
                        for(int j=1;j<=n;j++)
                        {
                            if(a[j]==0)
                            {
                                ans[i] = j;
                                a[j]=1;
                                break;
                            }
                        }
                    }
                }
            }

            for(int i=1;i<=n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println("");
        }
        
    }
}
