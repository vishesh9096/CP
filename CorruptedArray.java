import java.util.Scanner;

public class CorruptedArray {
    public static void merge(long arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        long L[] = new long[n1];
        long R[] = new long[n2];
 
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
    public static void sort(long arr[], int l, int r)
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
        for(int e=0;e<t;e++){

            int n = sc.nextInt();
            long b[] = new long[n+2];
            for(int i=0;i<n+2;i++)
                b[i] = sc.nextInt();
            long sum=0;
            sort(b, 0, n+1);
            for(int i=0;i<n;i++) sum+=b[i];
            if(sum==b[n])
            {
                for(int i=0;i<n;i++) System.out.print(b[i]+" ");
            }
            else{
                sum+= b[n];
                long req= b[n+1];
                int defauler =-1;
                for(int i=0;i<=n;i++)
                {
                    if(sum-b[i]==req)
                    {
                        defauler=i;
                        break;
                    }
                }
                if(defauler==-1) System.out.print(-1);
                else{
                    for(int i=0;i<n+1;i++)
                    {
                        if(i!=defauler) System.out.print(b[i]+" ");
                    }
                }


            }
            System.out.println("");
        }
    }    
}
