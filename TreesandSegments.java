import java.util.Scanner;

public class TreesandSegments {
    public static int[] zeros(int[] nums, int k) {
        int res[] = new int[3];
        int start =0;
        int end = 0;
        int ans = 0;    
        int zero =0;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {

            end = i;
            if(nums[i]==1) zero++;
            if(zero>k)
            {
                while(nums[start++]!=1);
                zero--;

            }
            if(end-start+1>ans)
            {
                b=end;
                a=start;
            }
            ans = Math.max(ans,end-start+1);
        }
        // System.out.println(a+" "+b);
        res[0]= a;
        res[1]= b;
        res[2]= ans;

        return res;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
        	count++;
        	result = Math.max(count, result);
            }
            else count = 0;
        }
        
        return result;
    }

     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int a[] = new int[n];
            for(int i=0;i<n;i++) if(s.charAt(i)=='1') a[i]=1;
            // for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            // System.out.println(" ");
            int score[] = zeros(a,k);
            for(int j=score[0];j<=score[1];j++)
            {
                if(score[1]!=0)
                a[j] =0;
            }
            int score0 = score[2];
            int score1 = findMaxConsecutiveOnes(a);
            for(int i=0;i<n;i++)
            {
                //
                System.out.print((i+1)*score0+score1+" ");
            }
            System.out.println("");
        }
    }
    
}
