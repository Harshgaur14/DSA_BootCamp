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
}
