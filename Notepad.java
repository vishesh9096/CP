import java.util.Scanner;

public class Notepad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if(s.length()<n) System.out.println(s);
            else{
                int a[] = new int[26];
                for(int i=0;i<s.length();i++)
                    a[s.charAt(i)-'a']++;
                int count=0;
                for(int i=0;i<26;i++)
                {
                    if(a[i]>0) count++;
                }
                if(count<=n) System.out.println("YES");
                else System.out.println("NO");
            }

        }
        
    }
}
