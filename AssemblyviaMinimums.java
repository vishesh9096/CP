import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssemblyviaMinimums {
   public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
 
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int ans[] = new int[n];
            int s = n*(n-1)/2;
            int a[] = new int[s];
            for(int i=0;i<s;i++) a[i] = sc.nextInt();
            sort(a,0,s-1);
            int j=0;
            List<Integer> at = new ArrayList<Integer>();
            for(int i=1;i<s;i++)
            {
                if(!at.contains(a[i])) at.add(a[i]);
            }
            while(at.size()!=n)
            {
                at.add(a[s-1]);
            }

            for(int i=0;i<n;i++) System.out.print(at.get(i)+" ");
            System.out.println("");
            
        }
    }
}
