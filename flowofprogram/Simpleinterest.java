import java.util.Scanner;

public class Simpleinterest{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float principal,time,rate;
            System.out.println("Enter the principal , time and rate ");
            principal=input.nextFloat();
            time=input.nextFloat();
            rate=input.nextFloat();
   
            System.out.println(Simpleinterests(principal,time,rate));
        }
    }
    public static float Simpleinterests(float p,float t,float r)
    {
        float si=0;
        si=(p*r*t)/100;
        return si;
    }
}