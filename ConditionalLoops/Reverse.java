public class Reverse {
    public static void main(String[] args) {
        String a="harsh";
        String res="";
        for(int i=a.length()-1;i>=0;i--)
        {
            res=res+a.charAt(i);
        }
        System.out.println(res);
    }
}
