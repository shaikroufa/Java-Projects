import java .util.Scanner;
public class Shopping {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String item;
    int quantity;
    char currency='$';
      Double price=25.1;
    Double total;

    System.out.print("What wouold you like to buy: ");
    item = sc.nextLine();
    System.out.print("Quantity( 1 or more): ");
    quantity = sc.nextInt();
    System.out.println("price of one  item is : " + price +currency);
    
    total=price*quantity;

    System.out.println("The total bill of your's is: "+total +currency);


    sc.close();



    }
}
