package main.java.com.github.ellemarshall5.cs3230;

import java.util.List;
import java.util.ArrayList;

public class StringOperations {
    public List<Boolean> Palindrome(List<String> stringList) {
        List<Boolean> palindromeList = new ArrayList<>();
        Boolean isPalindrome;
        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
            int j = 0;
            int k = stringList.size() - 1;
            while (j < k) {
                if (str.charAt(j) != str.charAt(k)) {
                    isPalindrome = false;
                } else {
                    isPalindrome = true;
                }
                j++;
                k++;
                palindromeList.add(isPalindrome);
            }
        }
        return palindromeList;
    }
}
