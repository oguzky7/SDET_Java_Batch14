package Repl168;

class Main {
     String myString="hello";

    public final String reverseMyString(){
        return new StringBuilder(myString).reverse().toString();
    }

    public static void main(String[] args){
        Main main=new Main();
        System.out.println(main.reverseMyString());
    }
}
