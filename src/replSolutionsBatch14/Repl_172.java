package Repl172;

abstract class Parent{
    abstract void m1();
    public  void m2(String myString){
        System.out.println(myString);
    };
}

class Main extends Parent {
    public void m1(){
        System.out.println("m1 without parameters");
    }


    public static void main(String[] args){
        Main obj=new Main();
        obj.m1();
        obj.m2("m1 method with parameter");
    }
}

