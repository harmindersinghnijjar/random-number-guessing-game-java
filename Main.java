/*

Programmer: Harminder Singh Nijjar

Assignment Chapter: Chapter 5

Purpose: The purpose of the Java program is to generate a random number and have the user guess what it is. Depending on the user's guess, the program will provide 
feedback to the user (e.g. too high/too low).
   
Date modified: 11/30/2022

IDE/Tool used: IntelliJ IDEA

*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generate a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        // Loop until user guesses the random number
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
        }

        // User guessed the random number
        System.out.println("You guessed the number! It was " + randomNumber);
    }
}
