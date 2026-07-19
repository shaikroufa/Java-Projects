import java.util.Scanner;

import java.util.Scanner;
//MAD LIBS GAMES
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//declaring adjectives and nouns for story
        String adjective1;
        String noun1;
        String adjective2;
        String noun2;
        String adjective3;
        String noun3;
//asking the user for nouns and adjectives
        System.out.print("Enter an adjective: ");
        adjective1 =sc.nextLine();
        System.out.print("Enter an noun: ");
        noun1 =sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 =sc.nextLine();
        System.out.print("Enter a noun: ");
        noun2 =sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 =sc.nextLine();
        System.out.print("Enter an noun: ");
        noun3 =sc.nextLine();

//crating story by taken nouns and adjectives by using the println ststements
        System.out.println("Today i went to a  "+adjective1 +"park and i saw ");
        System.out.println("differnt things happening like "+noun1 +"climbing trees");
        System.out.println("and monkeys are "+adjective2 +"like humans");
        System.out.println("This dilema is occured in "+noun2 +"park");
        System.out.println("which is known for its "+adjective3 +".");
        System.out.println("Don't know which "+noun3 +"is going to be next");


//closing scanner
        sc.close();

    }
}
