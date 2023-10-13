import java.util.Scanner;

public class MaximumRounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k=0;k<t;k++)
        {
            String n = sc.nextLine();
            int carry=0;
            int f=0;
            for(int j=n.length()-1;j>=0;j--)
            {
                
                if(Integer.parseInt(String.valueOf(n.charAt(j)))+carry>=5) {
                    carry=1;
                    f=j+1;
                    System.out.print(" hello "+j+" "+Integer.parseInt(String.valueOf(n.charAt(j)))+carry);

                }
                else carry=0;

            }
            System.out.println("");

        }
    }
}
