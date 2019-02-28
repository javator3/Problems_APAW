package pl.sda.problems_apaw;

import java.util.Collections;
import java.util.List;

public class P01 {
    public static String last(List<String> asList) {

        return asList.get(asList.size()-1);
        //numbers.size();


        
    }

    public static List<Integer> revers(List<Integer> numbers) {

        Collections.reverse(numbers);

        return numbers;
    }

    public static boolean isPalindrome(List<String> asList) {
        return true;
    }

    public static boolean isPalindrome1(List<Integer> asList) {

        return true;
    }
}
