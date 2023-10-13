import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int anna = a+c/2;
            int kel = b+c/2;
            if(c%2!=0) anna++;
            if(anna>kel) System.out.println("First");
            else System.out.println("Second");
        }
    }
}
