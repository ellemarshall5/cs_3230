package com.github.ellemarshall5.cs3230;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for (int j : intArray) {
            if (j % 2 == 0) {
                evenList.add(j);
            }
        }
        return evenList;
    }
    public static List<Integer> Odds(int[] intArray){
        List<Integer> oddList = new ArrayList<>();
        for (int j : intArray) {
            if (j % 2 != 0) {
                oddList.add(j);
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
        return sum/numIndex;
    }
    public static double StandardDeviation(int[] intArray){
        double standDeviation = 0;
        double mean = Mean(intArray);
        double sq;
        double res;

        for (int j : intArray) {
            standDeviation = standDeviation + Math.pow((j - mean), 2);
        }
        sq = standDeviation / intArray.length;
        res = Math.sqrt(sq);

        return res;
    }
    public static double Median(int[] intArray){
        double median;
        int length = intArray.length;
        if(length % 2 == 1){
            median = intArray[((length + 1) / 2) - 1];
        }else{
            median = (intArray[length/ 2 - 1] + intArray[length/2]) / 2;
        }
        return median;
    }
    public static int FirstQuartile(int[] intArray){
        int[] q1 = new int[intArray.length];
        System.arraycopy(intArray,0, q1, 0, intArray.length);
        Arrays.sort(q1);
        return (int) Math.round(q1.length * 25/100);
    }
    public static int ThirdQuartile(int[] intArray){
        int[] q3 = new int[intArray.length];
        System.arraycopy(intArray,0, q3, 0, intArray.length);
        Arrays.sort(q3);
        return (int) Math.round(q3.length * 75/100);
    }
}
