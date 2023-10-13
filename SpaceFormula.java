import java.util.Scanner;

public class SpaceFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            int n = sc.nextInt();
            int r = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i=0;i<n;i++) a[i] =sc.nextInt();
            for(int i=0;i<n;i++) b[i] =sc.nextInt();
            int max = a[r-1]+b[0];
            int rank=1,j=1,end=n-1;

            for(int i=0;i<n;i++)
            {
                if(i==r-1) continue;
                if(a[i]+b[j]>max&&a[i]+b[end]>max){ rank++;
                    j++;
                }
                else{
                    end--;
                }
               
            }
            System.out.println(rank);

        
    }
}
