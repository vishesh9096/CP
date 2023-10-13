import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int flag=0;
            int a[] = new int[n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(i>0)
                {
                    min = Math.min(min,a[i]-a[i-1]);
                    if(min<0) flag=1;
                }
                

            }
            if(flag==0)
                System.out.println((min/2)+1);
            else   
                System.out.println(0);
        
        }   
        
    }
    
}
