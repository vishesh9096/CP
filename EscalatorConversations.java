import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int h = sc.nextInt();
            int a[] = new int[n];
            int s=0;
            for(int i=0;i<n;i++)
            {
                a[i] = Math.abs(sc.nextInt()-h);



            }
            int count=0;
            for(int i=0;i<n;i++)
            {
               if(a[i]%k==0) {
                int x = a[i]/k;

               if(x<m&&x>0) count++;
                
               }
               
               
            }
            System.out.println(count);

        }
        
    }    
}
