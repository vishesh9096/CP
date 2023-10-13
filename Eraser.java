import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int  k = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int l=0,r=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='W') continue;
                count++;
                i+=k-1;

            }
            System.out.println(count);
        }
    }
}
