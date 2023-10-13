import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DigitalWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k= sc.nextInt();
        List<List<Integer>> aList = 
                  new ArrayList<List<Integer>>(n);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();  
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            pq.add(sc.nextInt());
        }


    }
    // pq.remove(1);
    Iterator itr=pq.iterator();  
        while(itr.hasNext()){  
        System.out.print(itr.next()+" ");  
        }  
    
    }

    
}
