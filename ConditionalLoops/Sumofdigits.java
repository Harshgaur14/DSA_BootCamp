public class Sumofdigits {
    public static void main(String[] args) {
        int d=1342;
        System.out.println(digitsum(d));
    }


    static int digitsum(int n)
    {
        if (n==0)
            return 0;
        return (n%10)+digitsum(n/10);

    }
}
