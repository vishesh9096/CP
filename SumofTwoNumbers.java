import java.util.Scanner;

public class SumofTwoNumbers
{
    public static int disum(int a)
    {
        int sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            if(n%2==0) System.out.println(n/2+" "+n/2);
            else{
               if(n/2%10==9)
               {
                int a = n/2;
                int b = n/2+1;

                while(Math.abs(disum(a)-disum(b))>1)
                {
                    a--;
                    b++;
                }
                System.out.println(a+" "+b);

               }
               else{

               
                System.out.println(n/2+" "+(n/2+1));
               }
            }
        }
        
    }
}
