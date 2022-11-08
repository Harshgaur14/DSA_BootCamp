public class Productsum {
    public static void main(String[] args) {
        int d=1342;
        System.out.println(prosum(d));
    }


    static int prosum(int n)
    {
        if (n==0)
            return 1;
        return (n%10)*prosum(n/10);

    }
}
