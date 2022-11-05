import java.util.Scanner;

public class Daysofmonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month");
        int m=input.nextInt();
        int days=0;
        switch(m){
        case 4:
        case 6:
        case 9:
        case 11:
            days=30;
            break;

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            days=31;
            break;
        case 2: 
            days=28;
            break;

        default:
            days=0;
            break;
        }

    if(days!=0)
    {
        System.out.printf("Days are %d",days);

    }
    else{
        System.out.printf("You have entered invalid month %d",days);
    }

    }
}
