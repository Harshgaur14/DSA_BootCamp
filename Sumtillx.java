import java.util.*;

class Sumtillx{
public static void main(String[] args) {

String choice = "";

int sum = 0;
Scanner input = new Scanner(System.in);

while(!choice.equals("x")){
     choice = input.next();

    if(!choice.equals("x")){
        int number = Integer.parseInt(choice);
        sum = sum+number;
    }
} 

System.out.println("Sum is "+sum);

}
}