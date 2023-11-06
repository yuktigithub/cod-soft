package com.task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int totalScore = 0;   // it counts the number of correct guess
        int lives = 5;        // a finite number of tries before the game ends with a game over
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("!!!Welcome to the Number Guessing Game!!!");
        gameOn(lives, totalScore, sc);

    }
    public static int randomNum() {        //This function generates a random number
        return (int) Math.floor(Math.random() * 100)+1;
    }

    public static void gameOn(int live, int totalScore, Scanner sc) {
        int randomNum = randomNum();
        System.out.println();
        System.out.println("Displaying random number for testing: "+randomNum+"\n");
        String thanks = "Thanks for playing!";
        System.out.println("lives: "+live+"                 "+"score: "+ totalScore +"\n");

        Status: while (live > 0) {            //I have given a label of name called Status to this while loop.
            System.out.print("Please guess a number between 1 to 100: ");
            int guess = sc.nextInt();
//            int difference = guess - randomNum;       //This can be used for most accurate guess hint
            if (guess == randomNum) {                   //condition 1
                System.out.println("Hurray! You have guessed the correct number: " + guess);
                totalScore++;
                System.out.println("Would you like to continue?\nEnter yes or no!");
                String playAgain = (sc.next()).toLowerCase();
                if (playAgain.equals("yes")) {
                    gameOn(live, totalScore, sc);         //recursion
                } else {
                    System.out.println("your total score is: " + totalScore);
                    System.out.println(thanks);
                    restart(sc);
                    break Status;

                }

            } else if (guess > randomNum) {                                  //condition 2
                System.out.println("Oops! Your guess is too high >>> ");
                live--;
                System.out.println("lives: "+live+"                  "+"score: "+totalScore);

                if (live == 0) {
                    System.out.println("OOPS! you are out of lives! GAME OVER!");
                    System.out.println("your total score is: " + totalScore);
                    System.out.println("Would you like to play again?\nEnter yes or no!");
                    String playAgain = (sc.next()).toLowerCase();
                    if (playAgain.equals("yes")) {
                        gameOn(5, 0,sc);
                    } else {
                        System.out.println(thanks);
                        restart(sc);
                    }
                }

            } else {                                                            //condition 3
                System.out.println("Oops! Your guess is too low <<< ");
                live--;
                System.out.println("lives: "+live+"                 "+"score: "+totalScore);

                if (live == 0) {
                    System.out.println("OOPS! you are out of lives! GAME OVER!");
                    System.out.println("your total score is: " + totalScore);
                    System.out.println("Would you like to play again?\nEnter yes or no!");
                    String playAgain = (sc.next()).toLowerCase();
                    if (playAgain.equals("yes")) {
                        gameOn(5, 0, sc);
                    } else {
                        System.out.println(thanks);
                        restart(sc);
                    }
                }
            }
        }
    }
    public static void restart(Scanner sc){                //   To restart a game!
        System.out.println("Would you like to restart the game!\nEnter yes or no!");
        String ans = sc.next();
        if(ans.equals("yes")){
            gameOn(5,0,sc);
        }

    }
}
