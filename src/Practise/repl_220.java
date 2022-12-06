package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class repl_220 {public static String ssn= "";
    public static String str="";

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(formatString("00-44   48 555555"));
    }

    public static String formatString(String S) {

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        for (int i = 0; i < S.length(); i++) {

            str=""+(S.charAt(i));
            if(numbers.contains(str)){

                ssn = ssn+str;

            }
        }
        return ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(6, 9);
    }
//    public static String ssn= "";
//    public static String str="";
//
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        System.out.println(formatString("00-44   48 555555"));
//    }
//
//    public static String formatString(String S) {
//
//        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));        //'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
//        for (int i = 0; i < S.length(); i++) {
//            //System.out.println(S.charAt(i));
//            str=""+(S.charAt(i));
//            if(numbers.contains(str)){
//
//                //System.out.println(str);
//                ssn = ssn+str;
//
//                //System.out.println(numbers);
//            }
//        }
//
//
//        return ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(6, 9);
//    }
}