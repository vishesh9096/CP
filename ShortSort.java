import java.util.Scanner;

public class ShortSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            
            String s = sc.next();
            // System.out.println(s+" "+e);
            String ans = "abc";
            int count=0;
            for(int i=0;i<3;i++)
            {
                // System.out.println(s.charAt(i));
                if(s.charAt(i)!=ans.charAt(i)) count++;
            }
            if(count<=2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
