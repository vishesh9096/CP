import java.util.Scanner;

public class DaltontheTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int e=0;e<t;e++){
        int n = sc.nextInt();
        int a[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++) {a[i] = sc.nextInt();
        if(a[i]==i+1) count++;
        }
        if(count%2==0)
        System.out.println(count/2);
        else System.out.println(count/2+1);

        }


    }
    
}
