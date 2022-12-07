package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class repl_220 {
    public static String ssn = "";
    public static String str = "";
    public static String result = "";

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(formatString("00-44   48 555555"));
    }

    public static String formatString(String S) {

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        for (int i = 0; i < S.length(); i++) {

            str = "" + (S.charAt(i));
            if (numbers.contains(str)) {

                ssn = ssn + str;
            }
        }
        result = ssn.substring(0, 3) + "-" + ssn.substring(3, 6) + "-" + ssn.substring(6, 9);
        if (ssn.length() > 9) {
            result = result + "-" + ssn.substring(9, 12);
        }
        return result;
    }

}