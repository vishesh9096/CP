public class Practice {
    public static int helper( int n)
    {
        if(n==0) return 0;
        else return n+helper(n-1);

    }
    public static void main(String[] args) {
        System.out.println(helper(5));
        
    }
    
}
