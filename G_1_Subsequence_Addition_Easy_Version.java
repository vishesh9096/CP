import java.util.Scanner;

public class G_1_Subsequence_Addition_Easy_Version
{
    public static  void merge(int arr[], int l, int m, int r)
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
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int flag = 0;
            int sum = 0;
            for(int i =0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(a[i]==1) flag++;
                sum+=a[i];
            }
            if(flag==0) System.out.println("NO");
            else{
                flag = 0;
                sort(a, 0, a.length - 1);
                long max = 0;
                long a2 = 1;
                for(int i=1;i<n;i++)
                {
                    max += a2;
                    if(a[i]>max){ flag =1;
                    break;
                    }
                    a2 = a[i];
                    // System.out.print(max+" ");

                }
                if(flag==0) System.out.println("YES");
                else System.out.println("NO");
                // System.out.println("");

                // 1 1 2 3 5 
                
                // 1 1 1 2 
                // 1 1 2 5 7 -> 5
                 // 1 1 2 4 7 
                // 1 1 2 3 4 5 6 7 
                

            }
        }
    }
}