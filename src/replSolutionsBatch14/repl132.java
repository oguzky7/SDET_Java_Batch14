package repl132;

public class repl132 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        a = reduce10(a);
        //print the elements from new array
    }

    //create method reduce10 here
    static int[][] reduce10(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print((j - 10) + " ");
            }
            System.out.println();
        }
        return arr;
    }
}

