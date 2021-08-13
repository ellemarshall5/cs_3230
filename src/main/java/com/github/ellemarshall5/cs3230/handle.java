package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;

public class handle {
    public static void mathHandle(int mathCommand, int [] numList) {
        switch (mathCommand) {
            case 1 : {
                System.out.println("The sum is " + MathOperations.Sum(numList));
                break;
            }
            case 2 : {
                System.out.println("Evens: "+ MathOperations.Evens(numList));
                break;
            }
            case 3 : {
                System.out.println("Odds: " + MathOperations.Odds(numList));
                break;
            }
            case 4 : {
                System.out.println("Max: " + MathOperations.Max(numList));
                break;
            }
            case 5 : {
                System.out.println("Min: " + MathOperations.Min(numList));
                break;
            }
            case 6 : {
                System.out.println("Enter a new list of integers: ");
                Cli.stringArrayToIntArray(Cli.getUserInput().split(" "));
                break;
            }
            case 7 : {
                System.out.format("Mean: %.4f\n", MathOperations.Mean(numList));
                break;
            }
            case 8 : {
                System.out.format("Standard Deviation: %.4f\n", MathOperations.StandardDeviation(numList));
                break;
            }
            case 9 : {
                System.out.println("5 Number Summary: ");
                System.out.println("Min: " + MathOperations.Min(numList));
                System.out.println("First Quartile: " + MathOperations.FirstQuartile(numList));
                System.out.println("Median: " + MathOperations.Median(numList));
                System.out.println("Third Quartile: " + MathOperations.ThirdQuartile(numList));
                break;
            }
            case 10 : {
                Menu.mainMenu();
            }
            case 11 : {
                System.out.println("Goodbye");
                System.exit(0);
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
            case 3 : {
                System.out.println("Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("unknown command");
            }
        }
    }

    public static void initialHandle(int initCommand) {
        switch (initCommand) {
            case 1 : {
                Menu.stringMenu();
            }
            case 2 : {
                Menu.mathMenu();
            }
            case 3 : {
                System.out.println("Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("unknown command");
            }
        }
    }
}
