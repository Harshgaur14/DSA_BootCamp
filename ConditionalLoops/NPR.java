public class NPR {
    public static void main(String[] args) {
        int n=5,r=3;
        System.out.println(nCr(n,r));
    }

    static int nCr(int n,int r)
    {
        return fact(n)/(fact(n-r)*fact(r));
    }

    static int fact(int n)
    {
        if(n==0)
            return 1;
        int res=1;
        for(int i=2;i<=n;i++)
        {
            res*=i;
        }
        return res;
    }
}
