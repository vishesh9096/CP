import java.util.Scanner;

class C_Perfect_Square
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {

            
            int n = sc.nextInt();
            String a[] = new String[n];
            for(int i=0;i<n;i++) a[i] = sc.next();
            for(int i=0;i<n;i++) System.out.println(a[i]);

        }
    }
}