public class Countzero {
    public static void main(String[] args) {
        int n=302040000;
        System.out.println(cntzero(n));
    }
    static int cntzero(int n)
    {
       return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0)
            return c;
        int rem=n%10;
        if(rem==0){
            c++;
            return helper(n/10, c);
        }
        return helper(n/10,c);
    }
}
