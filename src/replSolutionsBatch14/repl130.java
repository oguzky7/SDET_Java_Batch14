package repl130;

public class repl130 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array) {
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print((i / 2) + " ");
            } else {
                System.out.print((i *= 10) + " ");
            }
        }
    }
}

