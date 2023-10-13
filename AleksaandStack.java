import java.util.Scanner;

public class AleksaandStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            a[0] =1;
            a[1] = 3;
            a[2] = 5;
            for(int i=3;i<n;i++)
            {
                a[i] = (a[i-1]+2);
            }
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println("");
        }
    }
}
