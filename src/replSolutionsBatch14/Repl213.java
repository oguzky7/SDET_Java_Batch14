package Repl213;

class Main {
    public static void main(String[] args) {
        int temperature = 30;
        if (temperature < 32) {
            System.out.println(new RuntimeException("It is freezing"));
        }
    }

}