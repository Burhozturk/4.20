import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Skriv venligst noget");
        String stringInput=input.next();
        System.out.println(stringInput.length());
        System.out.println(stringInput.charAt(0));
    }
}
