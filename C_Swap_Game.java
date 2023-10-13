import java.util.*;
public class C_Swap_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            int b[] = new int[n+1];
            int max =0; 
            int index=0;
            for(int i=1;i<=n;i++)
            {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                if(a[i]<=10&&b[i]>=max){
                    max = b[i];
                    index =i;
                }
            }
            System.out.println(index);

        }
        
        
    }
}