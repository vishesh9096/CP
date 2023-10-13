import java.util.Scanner;

public class TwoVessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = Math.abs(b-a);
            int ans=0;
            int x =diff/2;
            if(diff%2!=0) x++;
            ans=x/c;
            if(x%c!=0) ans++;
            System.out.println(ans);
        }
    }
}
