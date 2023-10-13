import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetsandUnion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        for(int e=0;e<t;e++)
        {
            int n = sc.nextInt();
            List<HashSet<Integer>>  ans = new ArrayList<HashSet<Integer>>();
            HashSet<Integer> ex = new HashSet<>();
            for(int i=0;i<n;i++)
            {
                int k = sc.nextInt();
                HashSet<Integer> temp = new HashSet<>();
                for(int j=0;j<k;j++){
                    int num = sc.nextInt();
                    ex.add(num);
                     temp.add(num);
                    };
                ans.add(temp);
            }
            int max =0;
            // for(int i=0;i<ans.size();i++)
            // {
            //     Set<Integer> result = new HashSet<>();
            //     for(int j=0;j<ans.size();j++)
            //     {
            //         if(i==j) continue;
            //         result.addAll(ans.get(j));
            //         if(result.size()>max&&result.size()<ex.size()) max = result.size(); 
            //     }

                
                   
            // }
            // for(int i=0;i<ex.size();i++)
            // {
                
            // }
            for (Integer element : ex) {

                Set<Integer> result = new HashSet<>();
                for(int j=0;j<ans.size();j++)
                {
                    if(!ans.get(j).contains(element)) result.addAll(ans.get(j));
                    max = Math.max(max, result.size());

                }
            }
            System.out.println(max);
            
        }
        
    }
}
