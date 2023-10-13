import java.util.*;
public class B_Stand_up_Comedian{
     public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            if(a1==0&&a2==0&&a3==0&&a4==0) System.out.println("1");
            else if(a1==0) System.out.println("1");
            else{
                int ans = a1+ Math.min(a2, a3)*2;
                int mood = Math.min(a1+1,Math.abs(a3-a2)+a4);
                ans+=mood;
                System.out.println(ans);
            }
        }
    }
}