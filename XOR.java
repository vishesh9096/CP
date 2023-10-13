import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public  class XOR
{
    //Function to find the minimum number of swaps required to sort the array.
    public static int minSwaps(int arr[],List<Integer> p)
    {
         int ans = 0;
         int N = arr.length;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
 
        // Hashmap which stores the
        // indexes of the input array
        HashMap<Integer, Integer> h
            = new HashMap<Integer, Integer>();
 
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            h.put(arr[i], i);
        }
        for (int i = 0; i < N; i++) {
 
            // This is checking whether
            // the current element is
            // at the right place or not
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];
 
                // If not, swap this element
                // with the index of the
                // element which should come here
                swap(arr, i, h.get(temp[i]),p);
 
                // Update the indexes in
                // the hashmap accordingly
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }
      public static void swap(int[] arr, int i, int j,List<Integer> p)
    {
        if(i!=j)
        {
            p.add(i+1);
            p.add(j+1);
            p.add(j+1);
            p.add(i+1);
            p.add(i+1);
            p.add(j+1);
            
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)    a[i] = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            int x = minSwaps(a,ans);
            // System.out.println(a);
            // for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            
            
            if(ans.size()==0) System.out.println("0");
            else    System.out.println(ans.size()/2);
            for(int i=0;i<ans.size();i++)
            {
                System.out.println(ans.get(i)+" "+ans.get(i+1));
                i++;
            }
            // System.out.println("done");
            
        }
    }
}


