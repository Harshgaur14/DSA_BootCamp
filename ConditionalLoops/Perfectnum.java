public class Perfectnum {
    public static void main(String[] args) {
        int a=29;
        System.out.println(isperfectnum(a));
    }

    static boolean isperfectnum(int n)
    {
        int ans=0;
        for(int i=1;i<28;i++)
        {
            if(n%i==0)
            {
                ans+=i;
            }
        }
        if(n==ans)
            return true;
        return false;
    }
}
