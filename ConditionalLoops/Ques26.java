import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int neg=0;
        int poseven=0;
        int posodd=0;
        while(a!=0)
        {
            if(a<0)
            {
                neg+=a;
            }
            else if(a>0 && a%2==0)
            {
                poseven+=a;
            }else{
                posodd+=a;
            }
        a=input.nextInt();

        }
        System.out.println("negative sum is "+neg);
        System.out.println("positive even sum is "+poseven);
        System.out.println("positive odd sum is "+posodd);
    }
}
