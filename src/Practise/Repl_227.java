package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
HTML Elements
Have the function HTMLElements (str) read the str parameter being passed which will be a string of HTML DOM elements and plain text.
The elements that will be used are: b, i, em, div, p. For example:

if str is < div>< b>< p>hello world< /p>< /b> < /div>

then this string of DOM elements is nested correctly so your program should return the string true.
If a string is not nested correctly, return the first element encountered where, if changed into a different element, would result in a properly formatted string.
If the string is not formatted properly, then it will only be one element that needs to be changed.
For example: if str is '< div> < i>hello< /i>world< /b>" then your program should return the string div because if the first < div> element were changed into a < b>,
the string would be properly formatted.

Examples
Input: "< div>< div>< b>< /b>< /div>< /p>" Output: div


Input: "< div>abc< /div>< p>< em>< i>test test test< /b>< /em>< /p>"

Output: i
 */

public class Repl_227 {
    public static List<String> words = new ArrayList<>(Arrays.asList("b", "i", "em", "div", "p"));
    public static List<String> elements = new ArrayList<>();
    public static String word = "";
    public static int counter = 0;
    public static boolean a = true;
    public static String result = "";

    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String str) {
        elements.clear();
        for (int i = 0; i < str.length(); i++) {
            a = true;
            if (str.charAt(i) == '<') {
                while (a) {

                    word = word + str.charAt(i);
                    i++;
                    if (str.charAt(i) == '>') {
                        a = false;
                        //word = word.substring(1,word.length()-1);
                        word = word.replaceAll("<", "");
                        word = word.replaceAll(">", "");
                        word = word.replaceAll("/", "");
                        elements.add(word);
                        word = "";
                    }

                }
            }
        }

        for (String s : words) {

            for (String element : elements){
                if (s.equalsIgnoreCase(element)) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                result = s;
                break;

            } else {
                result = "true";
            }
            counter = 0;
        }
        System.out.println(elements);
        return result;
    }
}
