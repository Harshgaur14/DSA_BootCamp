
 import java.util.Scanner;

public class Multi{
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=obj.nextInt();
        for(int i=1;i<=10;i++)
        {

        System.out.println(a+" x "+i+"= "+a*i);
        }
    }
}

