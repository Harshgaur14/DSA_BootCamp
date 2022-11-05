public class Hcf {
    public static void main(String[] args) {
        int a=20;
        int b=100;
        System.out.println(hcfnum(a,b));
    }
    static int hcfnum(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return hcfnum(b%a,a);
    }
}
