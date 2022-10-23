package Repl173;

abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}

class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}
class Main{
    public static void main(String[] args){
        Tea obj1=new LemonTea("Lemon Tea");
        obj1.addSugar();
        Tea obj2=new ChaiTea("Chai Tea");
        obj2.addSugar();

    }
}
