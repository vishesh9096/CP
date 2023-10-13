import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i=0;i<n;i++) a[i]= sc.nextInt();
            List<Long> temp = new ArrayList<Long>();
            int count=0;
            for(int i=1;i<n;i++)
            {
                if(temp.contains(a[i])) a[i]=0;
                else if(a[i]<a[i-1]&&!temp.contains(a[i]))
                {
                    count++;
                    temp.add(a[i]);
                    a[i]=0;
                }
            }
            System.out.println(count);

        }
    }
}
