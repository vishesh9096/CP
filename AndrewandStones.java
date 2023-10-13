import java.util.Scanner;

public class AndrewandStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int odd=0,eve=0,odcnt=0;
            for(int i=0;i<n;i++) {a[i] = sc.nextInt();
            if(a[i]%2==0&&i!=0&&i!=n-1) eve+=a[i];
            else if(i!=0&&i!=n-1){ odd+=a[i]; odcnt++;}
            }

            // System.out.println(eve+" "+odd+" "+odcnt);
            if(odcnt>eve) System.out.println("-1");
            else  System.out.println((eve+odd+odcnt)/2);

        }
    }
}
