package main.java.com.github.ellemarshall5.cs3230;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GUI {
    private JPanel rootPanel;
    private JTextField numEntry;
    private JLabel numLabel;
    private JButton evenButton;
    private JButton sumButton;
    private JButton minButton;
    private JButton meanButton;
    private JButton fiveNumberSummaryButton;
    private JButton oddButton;
    private JButton maxButton;
    private JButton standardDevButton;
    private JTextArea evensResult;
    private JTextArea sumResult;
    private JTextArea minResult;
    private JTextArea oddsResult;
    private JTextArea meanResult;
    private JTextArea maxResult;
    private JTextArea fiveNumButton;
    private JTextArea stanDevResult;
    private JButton numSubmit;

    List<Double> nums = new ArrayList<>();

    public GUI() {
        numSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    nums = getNumberList();
                } catch (NumberFormatException ex){
                    numEntry.setText("");
                }
            }
        });
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                sumResult.setText(String.valueOf(MathOperations.Sum(arr)));
            }
        });
        evenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                List<Integer> output = MathOperations.Evens(arr);
                evensResult.setText(output.toString());
            }
        });
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                minResult.setText(String.valueOf(MathOperations.Min(arr)));
            }
        });
        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                maxResult.setText(String.valueOf(MathOperations.Max(arr)));
            }
        });
        meanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                meanResult.setText(String.valueOf(MathOperations.Mean(arr)));
            }
        });
        fiveNumberSummaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                fiveNumButton.setText("Min: " + String.valueOf(MathOperations.Min(arr)) + "\n" +
                        "First Quartile: " + String.valueOf(MathOperations.FirstQuartile(arr)) + "\n" +
                        "Median: " + String.valueOf(MathOperations.Median(arr)) + "\n" +
                        "Third Quartile: " + String.valueOf(MathOperations.ThirdQuartile(arr)));
            }
        });
        standardDevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                stanDevResult.setText(String.valueOf(MathOperations.StandardDeviation(arr)));
            }
        });
        oddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] arr = nums.stream().map(Double::intValue).mapToInt(i->i).toArray();
                List<Integer> output = MathOperations.Odds(arr);
                oddsResult.setText(output.toString());
            }
        });
    }
    private List<Double> getNumberList(){
        return Arrays.stream(numEntry.getText().split("\\s"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("CS3230 Project");
        frame.setContentPane(new GUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
