package replSolutionsBatch14;

import java.io.*;
class repl_212 {
    private static final String filename() {
        String filename = "something";
        return filename;
    }

    public static void main(String[] args) {
        BufferedReader rd = null;
        try {

            rd = new BufferedReader(new FileReader(new File(filename())));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
