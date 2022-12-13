package Practise;
/*
Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
 */

public class Repl_224 {
    public static String result ="";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
        System.out.println(removeConsecutiveDuplicates("aabbcc"));
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
    }

    public static String removeConsecutiveDuplicates(String input) {
            result = input.substring(0,1) ;
        for(int i=1; i<input.length(); i++){
            if(input.charAt(i-1)!=input.charAt(i)){
                result = result +input.charAt(i);
            }
        }
        return result;
    }
}
