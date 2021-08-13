package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Cli {
    public static Scanner myScanner = new Scanner(System.in);

    public static String getUserInput(){
        System.out.print("> ");
        return myScanner.nextLine();
    }

    public static int[] stringArrayToIntArray(String[] strings){
        int[] integers = new int[strings.length];

        for(int i = 0; i < strings.length; i++){
            try{
                integers[i] = Integer.parseInt(strings[i]);
            }catch(NumberFormatException ex){
                System.out.println(strings[i] + " is not a valid integer. Please try again.");
            }
        }
        return integers;
    }
    public static List<String> userStringList(String[] strings){
        List<String> listOfStrings = new ArrayList<>();
        for (int i = 0; i < strings.length; i++){
            listOfStrings.add(strings[i]);
        }
        return listOfStrings;
    }
}
