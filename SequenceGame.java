import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n  = sc.nextInt();
            int a[] = new int[n];
            List<Integer> ans = new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
                // System.out.print(temp+" ");

            }
            if(n==1){
                System.out.println(1);
                System.out.println(a[0]);
            }
            else{
                ans.add(a[0]);
                for(int i=1;i<n;i++)
                {
                    if(a[i]>=a[i-1]) {
                        ans.add(a[i]);
                       
                        continue;
                    }
                    else{
                        // System.out.println(a[i]);
                        int temp = a[i]-1;
                        if(temp==0) temp++;
                        ans.add(temp);
                        ans.add(a[i]);

                    }
                    
                }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++) System.out.print(ans.get(i)+" ");
            System.out.println("");
        }
        }
    }
}
