import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) a[i] =sc.nextInt();

            int s = 1;
            for(int i=0;i<n;i++)
            {
                if(s==a[i]) s++;
                s++;
            }
            System.out.println(s-1);
            


        }
    }
}
