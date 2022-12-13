package Practise;

import java.util.ArrayList;
import java.util.List;

/*
Reverse the String without using the Reverse method from the StringBuilder Class
input["I am a java Programmer"] output["Programmer java a am I"]

input["Syntax is Great"] output["Great is Syntax"]

 */
public class Repl_226 {

    public static String result = "";
    public static String word = "";

    public static List<String> words = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(reverse("Syntax is Great"));
        System.out.println(reverse("I am a java Programmer"));
    }

    public static String reverse(String strToRev) {
        words.clear();
        result="";
        strToRev = strToRev + " ";
        for (int i = 0; i < strToRev.length(); i++) {
            if (strToRev.charAt(i) != ' ') {
                word = word + strToRev.charAt(i);
            } else {
                words.add(word);
                word = "";
            }
            //System.out.println(word);
        }
        System.out.println(words);
        for (int i = 0; i < words.size(); i++) {
            result = result + words.get(words.size()-(i+1))+" ";
        }
        result = result.substring(0,result.length()-1);


        return result;
    }
}
