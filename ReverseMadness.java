import java.util.Scanner;

public class ReverseMadness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int l[] = new int[k];
            int r[] = new int[k];
            for(int i=0;i<k;i++) l[i] = sc.nextInt();
            for(int i=0;i<k;i++) r[i] = sc.nextInt();
            int q = sc.nextInt();
            int x[] = new int[q];
            for(int i=0;i<q;i++) x[i] = sc.nextInt();
            int z=0;
            for(int i=0;i<q;i++)
            {

                for(int j=0;j<k;j++)
                {
                    
                    if(x[i]>=l[j]&&x[i]<=r[j])
                    {

                        int start = Math.min(x[i],r[j]+l[j]-x[i]);
                        int end = Math.max(x[i],r[j]+l[j]-x[i]);
                        start--;
                        end--;
                        String substringToReverse = s.substring(start, end+1 );
                        // System.out.println(substringToReverse);

                        StringBuilder reversedSubstring = new StringBuilder(substringToReverse);
                        reversedSubstring.reverse();


                        String result = s.substring(0, start) + reversedSubstring.toString() + s.substring(end + 1);
                        s = result;
                        break;
                        // System.out.println(result);
                    }
                    // z++;
                }

            }
            System.out.println(s);
        }
    }
}
