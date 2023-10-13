import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KoxiaandWhiteboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            PriorityQueue<Long> q = new PriorityQueue<Long>();
            long ans=0;
            long a[] = new long[n];
            long b[] = new long[m];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                q.add(a[i]);
            }
            for(int i=0;i<m;i++)
            {
                b[i] = sc.nextLong();
                
            }
            for(int i=0;i<m;i++)
            {
                q.poll();
                q.add(b[i]);
            }
            for(int i=0;i<n;i++)
                ans+=q.poll();
           

            
           
            
           
            
          
            System.out.println(ans);
            
        }
    }
}
