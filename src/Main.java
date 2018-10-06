//Imporeter en klasse
import java.util.Scanner;
//En main klasse
public class Main
{
    //En klasse som kører kun i denne klasse. Main metoden som har en input. Denne muliggør at main kan køres
    public static void main(String[] args)
    {
        //En objekt fra klassen scanner med instancering og en input
        Scanner input=new Scanner(System.in);
        //Udskriver noget
        System.out.println("Skriv venligst noget");
        //Gemmer en input i en string
        String stringInput=input.next();
        //Udskriver størrelsen af string
        System.out.println(stringInput.length());
        //Udskriver den første værdi af string
        System.out.println(stringInput.charAt(0));
    }
}
