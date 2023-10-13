import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            String nums[] = new String[10];
            for(int i=0;i<10;i++)
            {
                nums[i] = sc.next();
                
            }
            int sum=0;
            for(int i=0;i<10;i++)
            {
                String temp  = nums[i];
                for(int j=0;j<10;j++)
                {
                    if(temp.charAt((j))=='X') {
                        int row = i+1;
                        int col = j+1;
                        if(row>5) row = 11-row;
                        if(col>5) col=11-col;
                        sum+=Math.min(row, col);
                    
                    }

                }



            }
            System.out.println(sum);

        }
    }
}
