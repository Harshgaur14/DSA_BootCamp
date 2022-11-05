import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        String str,rev="";
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        int len=str.length();
       for(int i=len-1;i>=0;i--)
       {
        rev=rev+str.charAt(i);
       }

       if(str.equals(rev))
       {
        System.out.println("palindrome");
       }
       else
       {
        System.out.println("not palindrome");
       }
    }
}
