import java.util.*;
public class F_We_Were_Both_Children{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n  = sc.nextInt();
            int a[] = new int[n+1];
            int arr[] = new int[n+1];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
                if(a[i]<=n)
                arr[a[i]]++;
            }

            for(int i=1;i<=n;i++)
            {
                for(int j=a[i]+a[i];j<=n;j+=a[i]){
                    arr[j]++;

                }
                
            }
            int max=0;
            for(int i=1;i<=n;i++) if(arr[i]>max)max=arr[i];
            System.out.println(max);




        }
        
        
    }
}