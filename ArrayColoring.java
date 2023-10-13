import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];

            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                sum+=a[i];
            }
            if(sum%2==0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
