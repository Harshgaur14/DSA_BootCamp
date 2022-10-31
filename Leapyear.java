import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
      
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year");
        int a=obj.nextInt();
        if(a%4==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}