package Practise;
/*
Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_221 {
    public static String word = "";
    public static String result;
    public static String maxLenEven = "";
    public static List<String> words = new ArrayList<>();
    //public static int length = 0;

    public static String findMaxLenEven(String Str)
    {
        Str = Str + " ";
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) != ' ') {
                word = word + Str.charAt(i);
            } else {
                words.add(word);
                //length++;
                if (word.length() % 2 == 0 && word.length() > maxLenEven.length()) {
                    maxLenEven = word;
                }
                word = "";
            }
        }
        result = maxLenEven;
        if (maxLenEven.length() == 0) {
            result = "-1";
        }
        maxLenEven = "";
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("find MaxLen Even"));
        System.out.println(findMaxLenEven("I am very Good at Java"));
        System.out.println(findMaxLenEven("I was"));
        System.out.println(findMaxLenEven("Hardships often prepare ordinary people for an extraordinary destiny"));
    }
}


