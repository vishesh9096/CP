import java.util.Scanner;

public class GroupedCarriages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int cap[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){a[i] = sc.nextInt();
        sum+=a[i];}
        for(int i=0;i<n;i++)cap[i] = sc.nextInt();
        int tar = Math.ceilDiv(sum, n);
        int min = Integer.MAX_VALUE;
        System.out.println(tar);
        for(int i=0;i<n;i++)
        {
            


        }


    }
}
