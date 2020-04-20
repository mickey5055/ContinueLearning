
/**
 *
 * @author Miguel
 */

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String momName = null;
        
        String firstName = "Miguel";
        String lastName = "Melendez";
        System.out.println("What is your mom name? ");
        momName = scan.next();
        
        System.out.println("Type 3 values of int number: ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        
        String name = firstName + " " + lastName;
        
        double price = 20;
        String priceString = "Price: " + price;
        String name1 = firstName + " ";
        name1 = name1 + lastName;
        String currentPrice = Double.toString(price);
        
        System.out.println(name + " and he owe " + priceString);
        System.out.println(name1);
        System.out.println("Your mom name is " + momName);
        System.out.println(currentPrice);
        System.out.println(i1 +" "+ i2 + " " + i3);
    }
}
