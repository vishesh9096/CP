import java.util.Scanner;

public class B_Three_Threadlets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a, Math.min(b, c));
            int flag=0;
            if(a%min!=0||b%min!=0||c%min!=0)
                System.out.println("NO");
            else{
                int count=0;
                while(a!=min)
                {
                    a = a-min;
                    count++;
                    if(count>3) break;
                }
                while(b!=min)
                {
                    b= b-min;
                    count++;
                    if(count>3) break;
                }
                while(c!=min)
                {
                    c = c-min;
                    count++;
                    if(count>3) break;
                }
                if(count<=3)
                    System.out.println("YES");
                else System.out.println("NO");
                
                
            }
            // if(flag==1)  System.out.println("Yes");
            // else System.out.println("NO");
        }
    }
}