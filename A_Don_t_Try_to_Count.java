import java.util.Scanner;

public class A_Don_t_Try_to_Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int flag = 1;
            for(int i=0;i<=10;i++)
            {
                if(x.contains(s)){ System.out.println(i);
                flag = 0;
                break;
                }
                else x = x +x;
            }
            if(flag==1) System.out.println("-1"); 

        }
    }
}