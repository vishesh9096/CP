import java.util.Scanner;

public class AmbitiousKid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            int n = sc.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {a[i]= sc.nextInt();
            if(Math.abs(a[i])<min) min = Math.abs(a[i]);
            }

            System.out.println(min);


            

        
        
    }
}
