import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int min=Integer.MAX_VALUE;
            int pdt=1;
            int count=0;
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(a[i]==0&&count<1)
                {
                    count++;
                }
                else{
                    pdt*=a[i];

                }
                  
                if(a[i]<min) min = a[i];
            }
            if(min!=0)
                pdt/=min;
            min++;
            pdt*=min;
            System.out.println(pdt);
        }
    }
}
