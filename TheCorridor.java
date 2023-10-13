import java.util.Scanner;

public class TheCorridor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[][] = new int[n+1][3];
            int max = Integer.MAX_VALUE;
            for(int i=1;i<=n;i++)
            {
                a[i][0] = sc.nextInt();
                a[i][1] =sc.nextInt();
               
                
                    a[i][2] = a[i][0]+ (a[i][1]-1)/2;
               
                
                if(a[i][2]<max) max = a[i][2];

            }
            
            System.out.println(max);

        }
    }
}
