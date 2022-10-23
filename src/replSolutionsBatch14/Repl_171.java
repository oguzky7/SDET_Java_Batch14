package Repl171;

abstract class Parent{
    abstract void m1();
    public abstract void m1(String myString);
}

class Main extends Parent {
    public void m1(){
        System.out.println("m1 without parameters");
    }
    public void m1(String myString){
        System.out.println(myString);
    }

    public static void main(String[] args){
        Main obj=new Main();
        obj.m1();
        obj.m1("m1 method with parameter");
    }
}

