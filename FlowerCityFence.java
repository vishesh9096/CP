import java.util.Scanner;

public class FlowerCityFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n  = sc.nextInt();
            int a[] = new int[n];
            int max=0;
            
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
                if(a[i]>max) max=a[i];
            }
            if(n!=max) System.out.println("NO");
            else{
            int b[] = new int[max];
            for(int i=0, j = n - 1;i<max;i++)
            {
                while (j >= 0 && a[j] < i + 1) {
                    --j;
                }
     
                b[i] = j + 1;

            }
            int f=0;
            for(int i=0;i<max;i++)
            {
                if(a[i]!=b[i]) f=1;
            }

            if(f==0)  System.out.println("YES");
            else  System.out.println("NO");
        }
        }
    }
}
