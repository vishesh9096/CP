import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftCarpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int q=0;q<t;q++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            List<String> car = new ArrayList<String>();
            for(int i=0;i<n;i++)
             car.add(sc.nextLine());
            int a[] = new int[4];

            for(int i=0;i<m;i++)
            {
                int find=0;
                for(int k=0;k<4;k++) if(a[k]==0) {find = k;break;}
                for(int j=0;j<n;j++)
                {
                    // System.out.println("serchiing col "+i+" finding "+find);
                    String s = car.get(j);
                    if(find==0)
                    {
                        if(s.charAt(i)=='v') a[find] =1;

                    }
                    else if(find==1)
                    {
                        if(s.charAt(i)=='i') a[find] =1;

                    }
                    else if(find==2)
                    {
                        if(s.charAt(i)=='k') a[find] =1;

                    }
                    else if(find==3)
                    {
                        if(s.charAt(i)=='a') a[find] =1;

                    }

                }
            }
            int flag=0;
            for(int i=0;i<4;i++)
            {
                if(a[i]==0) flag=1;
                // System.out.print(a[i]);
            }
            if(flag==1) System.out.println("NO");
            else System.out.println("YES");
            
        }
        
    }
}
