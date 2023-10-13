import java.util.Scanner;


public class Channel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            int on= sc.nextInt();
            int len = sc.nextInt();
            String s = sc.next();
            if(on==n) System.out.println("YES");
            else{
                int max=on;
                int p=0;
                int ne=0;
                int flag=0;
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='+')
                    {
                        max++;
                        p++;
                    }
                    else{
                        max--;
                        ne++;

                    }
                    if(max==n) flag=1;
                }
                if(flag==1) System.out.println("YES");
                else{
                    if(on+p>=n) System.out.println("MAYBE");
                    else System.out.println("NO");
                }
            }

            // System.out.println(s);

        }
    }
    
}
