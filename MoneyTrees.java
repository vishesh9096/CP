import java.util.Scanner;

public class MoneyTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n  = sc.nextInt();
            int k = sc.nextInt();
            int f[] = new int[n];
            int h[] = new int[n];
            for(int i=0;i<n;i++) f[i] = sc.nextInt();
            for(int i=0;i<n;i++) h[i] = sc.nextInt();
            int len =0;
            int cur=0;
            int sum=0;
            for(int i=0;i<n-1;i++)
            {
                
                if(sum+f[i]>k)
                {
                    cur = 1;
                    sum=0;
                }
                else if(h[i]%h[i+1]!=0)
                {
                    cur++;
                    if(cur>len) len = cur;
                    cur=1;
                    sum=0;
                }
                else{
                    sum+=f[i];
                    cur++;
                    if(cur>len) len = cur;
                }
            }
            // if(cur>len&&sum<k) len = cur;

            System.out.println(len);
 
        }
    }
}
