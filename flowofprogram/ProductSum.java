import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(subtractProductAndSum(a));
    }

    public static int subtractProductAndSum(int n) {
        
        int sumofdigit=0;
        int productofdigit=1;
        while(n>0)
        {
             int rem=n%10;
            sumofdigit+=rem;
            productofdigit*=rem;
            n=n/10;
            
        }
        
        return productofdigit-sumofdigit;
    }


}
