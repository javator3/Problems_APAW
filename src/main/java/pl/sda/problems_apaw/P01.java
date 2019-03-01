package pl.sda.problems_apaw;

import java.util.Arrays;
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

        for (int i =0; i<asList.size(); i++) {
            if (asList.get(i) != asList.get(asList.size() - 1)) {
                return true;

            }
        }

        return false;
    }

    public static boolean isPalindrome1(List<Integer> asList) {

        for (int i = 0; i <asList.size(); i++){
            if (asList.get(i) == asList.get(asList.size()-1)){
                return false;
            }
        }

        return true;
    }
}
