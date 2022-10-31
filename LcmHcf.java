import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Two numbers a and b");
        int a=obj.nextInt();
        int b=obj.nextInt();
        
        int hcf=HCF(a,b);
        int lcm=(a*b)/hcf;
        System.out.println("the lcm is "+lcm+" hcf is "+hcf);

    }
    public static  int HCF(int a,int b)
    {
        if(b==0)
        {
            return a;
        }

        return HCF(b,a%b);
    }
}
