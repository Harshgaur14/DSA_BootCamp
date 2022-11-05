import java.util.Scanner;

public class Futureinvest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double p=input.nextDouble();
        double r=input.nextDouble();
        double y=input.nextDouble();

        double result=p*Math.pow((1+r/100), y);
        System.out.println(result);
        System.out.printf("%.3f",result);
    }
    
}
