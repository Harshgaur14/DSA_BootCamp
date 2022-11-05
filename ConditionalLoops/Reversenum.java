public class Reversenum {
    public static void main(String[] args) {
        int a=6789;
        System.out.println(reversenumber(a));

    }

    static int reversenumber(int a)
    {
        int b=0;
        while(a>0)
        {
            b=b*10+a%10;
                a/=10;
        }
        return b;
    }
}
