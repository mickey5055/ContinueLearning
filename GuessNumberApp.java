/**
 *
 * @author Miguel
 */

import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int LIMIT = 10;
        
        System.out.println("Guess the number! ");
        System.out.println("Im thinking of a number from 1 to " + LIMIT);
        System.out.println("");
    
        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // <----- d is >= 0 and < limit
        int number = (int) d; // convert double to int
        number++;   // int is >= 1 and <= limit
        
        int count = 1;
        while (true) {
            System.out.println("Your Guess: ");
            int guess = scan.nextInt();
            
            if (guess < 1 || guess > LIMIT){
                System.out.println("Invalid number, try again");
            }
            
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number){
                System.out.println("Too high");
            } else {
                System.out.println("You guess it right! and you took you " +
                        count + " tries. \n");
                break;
            }
             count++;
             
        } System.out.println("BYE!");
    }
    
}
