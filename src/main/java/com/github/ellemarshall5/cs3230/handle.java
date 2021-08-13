package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;

public class handle {
    public static void mathHandle(int mathCommand, int [] numList) {
        MathOperations operations = new MathOperations();
        switch (mathCommand) {
            case 1 : {
                System.out.println("The sum is " + operations.Sum(numList));
                break;
            }
            case 2 : {
                System.out.println("Evens: "+ operations.Evens(numList));
                break;
            }
            case 3 : {
                System.out.println("Odds: " + operations.Odds(numList));
                break;
            }
            case 4 : {
                System.out.println("Max: " + operations.Max(numList));
                break;
            }
            case 5 : {
                System.out.println("Min: " + operations.Min(numList));
                break;
            }
            case 6 : {
                System.out.println("Enter a new list of integers: ");
                Cli.stringArrayToIntArray(Cli.getUserInput().split("\s+"));
                break;
            }
            case 7 : {
                System.out.format("Mean: %.4f\n", operations.Mean(numList));
                break;
            }
            case 8 : {
                System.out.format("Standard Deviation: %.4f\n", operations.StandardDeviation(numList));
                break;
            }
            case 9 : {
                System.out.println("5 Number Summary: " + operations.FiveNumberSummary(numList));
                break;
            }
            case 10 : {
                Menu.mainMenu();
            }
            default: {
                System.out.println("unknown command");
            }
        }
    }
    public static void stringHandle(int stringCommand, List<String> stringList){
        StringOperations stringOps = new StringOperations();

        switch (stringCommand){
            case 1 : {
                System.out.println(stringOps.Palindrome(stringList));
            }
            case 2 : {
                Menu.mainMenu();
            }
            default: {
                System.out.println("unknown command");
            }
        }
    }

    public static void initialHandle(int initCommand) {
        switch (initCommand) {
            case 1: {
                Menu.stringMenu();
            }
            case 2: {
                Menu.mathMenu();
            }
            case 3: {
                System.out.println("Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("unknown command");
            }
        }
    }
}
