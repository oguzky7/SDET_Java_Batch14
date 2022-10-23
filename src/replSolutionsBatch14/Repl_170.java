package Repl170;

class Main {
     final void Display(boolean myBoolean){
        System.out.println("Final method with boolean parameter");
    }
     final void Display(String myString){
        System.out.println(myString);
    }
    public static void main(String[] args){
       Main main=new Main();
        main.Display(true);
       main.Display("Final method with String parameter");
    }
}