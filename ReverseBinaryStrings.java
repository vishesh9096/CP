import java.util.Scanner;

public class ReverseBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int ans=0;

            for(int i=0;i<s.length()-1;i++)
            {
               if(s.charAt(i)==s.charAt(i+1)) ans++;
                
            }

            System.out.println((ans+1)/2);
            

        }
    }
}
