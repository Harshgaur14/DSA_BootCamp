import java.util.Scanner;

public class Sumofinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int sum=0;
        while(a!=0)
        {
                sum+=a;
                a=input.nextInt();
        }  
        System.out.println(sum); 
    }
}
