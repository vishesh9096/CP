import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>a[max]) max=i;
            }
            List<Integer> ans = new ArrayList<Integer>();
            
            
            
        }
    }
    
}
