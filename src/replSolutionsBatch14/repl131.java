package repl131;


public class repl131 {
    static String thirdLetter(String s) {
        StringBuilder sRet = new StringBuilder();
        for (int i = 0; i < s.length(); i += 3) {
            sRet.append(s.charAt(i));
        }
        return sRet.toString();
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));//"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

