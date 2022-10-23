package Repl211;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            for (int i = 3; i <= arr.length; i++) {
                System.out.println(arr[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        }
    }
}