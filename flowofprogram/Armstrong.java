<<<<<<< HEAD
public class Armstrong {
    public static void main(String[] args) {
        int original=153;
        System.out.println(checkarmstrong(original));
    }
    static boolean checkarmstrong(int num)
    {
        int sum=0;
        int a=num;
        while(a>0){
           int rem=a%10;
            sum+=rem*rem*rem;
            a=a/10;
        }
        System.out.print(sum+" "+num);
        if(sum==num)
        {
           
            return true;
        }
        
        return false;
    }
=======
import java.util.Scanner;

public class Armstrong {
   public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 int a=input.nextInt();
 int actual=a;
 int sum=0;
 while(a>0)
 {
    int rem=a%10;
    sum+=rem*rem*rem;
    a=a/10;
 }
 if(sum==actual)
 {
    System.out.println("Armstrong number");
 }
 else{
    System.out.println("not a Armstrong number");
 }
   } 
>>>>>>> 1dce61d29a050cb43be42398cc11f4ceb1520da6
}
