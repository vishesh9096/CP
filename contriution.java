import java.util.Scanner;

public class contriution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            
            int sum=0;
            String s = sc.next();
            String s2 = sc.next();
            for(int i=0;i<5;i++)
            {
                int a = s.charAt(i)-'0';
                if(a==1)
                    sum+=1;
                else if(a==3) sum+=4;
                else if(a==5) sum+=6;
                else if(a==7) sum+=9;

            }

            for(int i=0;i<5;i++)
            {
                int a = s2.charAt(i)-'0';
                if(a==1)
                    sum-=1;
                else if(a==3) sum-=4;
                else if(a==5) sum-=6;
                else if(a==7) sum-=9;


            }
            System.out.println(sum);


        }
        
    }
}
