import java.util.Scanner;

public class Printsum {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Two numbers a and b");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=a+b;
        System.out.println("the sum of two number is "+c);

    }
}
