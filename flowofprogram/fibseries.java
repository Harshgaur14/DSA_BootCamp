import java.util.Scanner;

public class fibseries{
    public static void main(String[] args) {
        
        System.out.println("enter the number ");
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int first=0;
        int second=1;
        System.out.println(first+" "+second);
        int i=2;
        while(i<n)
        {
        int third=first+second;
        System.out.println(third);
        first=second;
        second=third;
        i++;
        }
    }
}