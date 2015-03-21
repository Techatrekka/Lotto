package com.coderdojo.midwest;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Seantheguy on 21/03/15.
 */
public class Main {

    public static void main(String   args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("You have guesses");
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            int randomNumber = random.nextInt(1);
            int Guess;
            System.out.println("Enter a positive Integer");
            Guess = input.nextInt();
            System.out.println("You entered " + Guess);
            if (randomNumber == Guess) {
                System.out.println("you have guessed correctly");
                System.exit(0);

            } else if (randomNumber != Guess) {
                System.out.println("You are wrong");
            }
        }
    }
}