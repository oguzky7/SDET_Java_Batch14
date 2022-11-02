package Practise;

class EncapsulationDemo{
    String empName;
    int empAge;

    EncapsulationDemo(String empName, int empAge){
        this.empName = empName;
        this.empAge  = empAge;
    }
    public void setName(String empName){
        this.empName = empName;
    }
    public void setAge(int empAge){
        this.empAge = empAge;
    }
    String getName(){return this.empName;}
    int getAge(){return this.empAge;}
}
class Main {
    public static void main(String[] args){
        EncapsulationDemo og = new EncapsulationDemo("Mario", 32);
        og.getName();
        og.getAge();
    }
}