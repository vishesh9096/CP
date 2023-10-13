import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++)
            {
                if (mp.containsKey(arr[i]))
                {
                    mp.put(arr[i], mp.get(arr[i]) + 1);
                }
                else
                {
                    mp.put(arr[i], 1);
                }
            }
            int max = 0;
            int val = 0;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet())
            {
            // System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getValue()>max){ max = entry.getValue();
            val = entry.getKey();
            }
            }
            if(mp.containsKey(k))
                System.out.println("YES");
            else System.out.println("NO");
            // if(mp.containsKey(k)&&mp.get(k)==val) System.out.println("YES");
            // else System.out.println("NO");
        }
    }
}
