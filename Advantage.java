import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            List<Integer> temp = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
               temp.add(a[i]);
               
                
            }
           Collections.sort(temp);
          int max = temp.get(temp.size()-1);
          int max2 = temp.get(temp.size()-2);
           
            for(int i=0;i<n;i++)
            {
                if(a[i]==max) System.out.print(a[i]-max2+" ");
                else System.out.print(a[i]-max+" ");
            }
            System.out.println("");
        }
    }
}
