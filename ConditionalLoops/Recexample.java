public class Recexample {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
        funrev(n);
    }
    static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        System.out.print(n+" ");
        return fun(n-1);
    }
    static void funrev(int n)
    {
        if(n==0)
        {
            return ;
        }
        
     funrev(n-1);
    System.out.print(n+" ");    
    }
}
