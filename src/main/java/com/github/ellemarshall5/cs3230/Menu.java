package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    public static void mainMenu(){
        int mainUserInput = 0;

        while(mainUserInput != 3){
            System.out.println("Please choose the operation type: ");
            System.out.println("1. String Operations");
            System.out.println("2. Math Operations");
            System.out.println("3. Exit");
            mainUserInput = Cli.myScanner.nextInt();
            handle.initialHandle(mainUserInput);
        }
    }

    public static void stringMenu(){
        Cli cli = new Cli();
        int userInput = 0;

        System.out.println("Please enter a list of words: ");
        List<String> strings = new ArrayList<>(cli.userStringList(Cli.getUserInput().split("\\s+")));

        while (userInput != 2){
            System.out.println("1. Palindrome Check");
            System.out.println("2. Back to Main Menu");
            userInput = Cli.myScanner.nextInt();
            handle.stringHandle(userInput, strings);
        }
    }
    public static void mathMenu(){
        Cli cli = new Cli();

        System.out.println("Enter list of integers: ");
        int[] ints = cli.stringArrayToIntArray(Cli.getUserInput().split("\\s+"));
        int mathUserInput = 0;

        while (mathUserInput != 11) {
            System.out.println("Please choose an operation: ");
            System.out.println("1. Sum");
            System.out.println("2. Evens");
            System.out.println("3. Odds");
            System.out.println("4. Max  ");
            System.out.println("5. Min");
            System.out.println("6. Update");
            System.out.println("7. Mean");
            System.out.println("9. Five Number Summary: ");
            System.out.println("10. Back to Main Menu");
            mathUserInput = Cli.myScanner.nextInt();
            handle.mathHandle(mathUserInput, ints);
        }
    }
}
