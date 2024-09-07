import java.util.Scanner;
import java.lang.String;


public class Main
{
    public static boolean  isPalindrome(int x)
    {

        String strInt = Integer.toString(x);
        String revstr = new StringBuilder(strInt).reverse().toString();
        boolean what = revstr.equals(strInt);

        return what;
    }

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int inputz;
        inputz = input.nextInt();
        isPalindrome( inputz );
    }
}