import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        char c=input.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("Vowels");
            return ;
        }

         System.out.println("Consonants");
    }
}
