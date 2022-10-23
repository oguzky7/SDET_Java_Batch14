package repl133;

public class Repl133 {

    static int countA(String s) {
        s=s.replaceAll("[^Aa]", "");
        return s.length();
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}


