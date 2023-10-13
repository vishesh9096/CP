import java.util.Scanner;

public class MEXRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n+1];
            int temp[] = new int[n+1];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                b[i+1] = a[i];
                temp[a[i]]++;
            }
            for(int i=0;i<n+1;i++)
            {
                if(temp[i]==0)
                {
                    b[0] = i;
                    break;
                }
            }
            int ptr = n+1;
            int count=1;
            k=k%(n+1);
            k--;
            ptr  = (ptr-k)%(n+1);
            // while(count+n+1<k)
            //     count+=n+1;
            // while(count!=k)
            // {
            //     count++;
            //     if(ptr==0) ptr=n;
            //     else
            //         ptr --;
            // }
            count=0;
            for(int i=0;i<n;i++)
            {
                System.out.print(b[ptr]+" ");
                ptr=(ptr+1)%(n+1);
            }
            System.out.println("");
        }
    }
}
