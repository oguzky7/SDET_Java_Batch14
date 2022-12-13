package Practise;
/*
Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
 */

public class Repl_225 {
    public static int reversed=0;
    public static int lastDigit=0;
    public static void main(String[] args) {
        System.out.println(reverseInteger(753));

    }

    public  static int reverseInteger(int N){

        System.out.println("Original Number: " + N);

        // run loop until num becomes 0
        while(N != 0) {

            // get last lastDigit from num
            lastDigit = N % 10;
            reversed = reversed * 10 + lastDigit;

            // remove the last lastDigit from num
            N = N/10;
        }

        System.out.println("Reversed Number: " + reversed);
        return reversed;
    }
}
