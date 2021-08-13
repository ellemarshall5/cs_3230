package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;
import java.util.ArrayList;


public class MathOperations {
    public static int Sum(int[] intArray) {
        int sum = 0;
        for (int j : intArray) {
            sum = sum + j;
        }
        return sum;
    }

    public static List<Integer> Evens(int[] intArray){
        List<Integer> evenList = new ArrayList<>();
        for(int i = 0; i < intArray.length;i++){
            if(intArray[i] % 2 == 0){
                evenList.add(intArray[i]);
            }
        }
        return evenList;
    }

    public static List<Integer> Odds(int[] intArray){
        System.out.println("test 1");
        List<Integer> oddList = new ArrayList<>();
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] % 2 != 0){
                oddList.add(intArray[i]);
            }
        }
        return oddList;
    }

    public static int Max(int[] intArray){
        int max = 0;
        for (int j : intArray) {
            if (max < j)
                max = j;
        }
        return max;
    }

    public static int Min(int[] intArray){
        int min = 0;
        for (int j : intArray) {
            if (min > j)
                min = j;
        }
        return min;
    }
    public static double Mean(int[] intArray){
        double sum = Sum(intArray);
        double numIndex = intArray.length;
        double mean = sum/numIndex;
        return mean;
    }
    public static double StandardDeviation(int[] intArray){
        double standDeviation = 0;
        double mean = Mean(intArray);
        double sq = 0.0;
        double res = 0.0;

        for(int i = 0; i < intArray.length; i++){
            standDeviation = standDeviation + Math.pow((intArray[i] - mean), 2);
        }
        sq = standDeviation / intArray.length;
        res = Math.sqrt(sq);

        return res;
    }
    public static int FiveNumberSummary(int[] intArray){
        return 0;
    }
    public static void Exit(){}
}
