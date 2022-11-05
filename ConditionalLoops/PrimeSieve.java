public class PrimeSieve{
    public static void main(String[] args) {
        int n=40;
        boolean[] isprime=new boolean[n+1]; 
        seiveprime(40,isprime);
    }

    public static void seiveprime(int n,boolean[] isprime)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(!isprime[i])
            {
                for(int j=i*2;j<=n;j+=i){
                    isprime[j]=true;
                }
            }
        }

        System.out.println("Prime numbers are: ");

        for(int i=2;i<=n;i++)
        {
            if(!isprime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}