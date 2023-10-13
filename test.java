// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int t=sc.nextInt(); 
        int a,b,c,n;
        for(int i=1;i<=t;i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            n = sc.nextInt();
            if((a+b+c+n)%3==0) System.out.println("YES");
            else System.out.println("NO");
        }
        
        
    }
}