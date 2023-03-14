package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3Task {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String myString = READER.readLine();
        String deleteUnnecessarySymbols = myString.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        char[] result = deleteUnnecessarySymbols.toCharArray();
        int stringLength = deleteUnnecessarySymbols.length();
        boolean isPalindrome = true;
        countIfEven(myString, result, stringLength, isPalindrome);

    }

    private static void countIfEven(String myString, char[] result, int stringLength, boolean isPalindrome) {
        if(stringLength % 2 == 0){
            isPalindrome = isPalindrome(result, stringLength, isPalindrome);
            palindrome(myString, isPalindrome);

        }else {
            System.out.println(myString + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(char[] result, int stringLength, boolean isPalindrome) {
        for (int i = 0; i < stringLength / 2; i++) {
            if (result[i] != result[stringLength - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static void palindrome(String myString, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(myString + " is a palindrome.");
        } else {
            System.out.println(myString + " is not a palindrome.");
        }
    }

}
