package HomeWorks.class26_HW1;

import java.util.ArrayList;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Car extends Insurance {
    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    void getQuote() {
        System.out.println("The price of this " + carModel + " is $82,000.00");
    }

    void cancelInsurance() {
        System.out.println(insuranceName+ " has been cancelled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends Insurance{
        String petType  ;
    Pet(String insuranceName, String petType){
            super(insuranceName);
            this.petType = petType;
        }
        void getQuote(){
            System.out.println("Pet insurance");
        }
        void cancelInsurance(){
            System.out.println(insuranceName + " has been cancelled for "+ petType);
        }
    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insurance{
            Health(String insuranceName){
                super(insuranceName);
            }
            void getQuote(){
                System.out.println("Health insurance");
            }
            void cancelInsurance(){
                System.out.println(insuranceName + " has been cancelled");
            }
    @Override
    public String toString() {
        return super.toString();
    }
}
class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();

        insurances.add(new Car("Geico", "Chevrolet"));
        insurances.add(new Pet("Healty Paws", "Golden"));
        insurances.add(new Health("Allianz"));

        System.out.println("With Enhanced for loop:");System.out.println(" ");

        for (Insurance ins:insurances) {
            ins.getQuote();
            ins.cancelInsurance();
            System.out.println(ins.toString());
        }
        System.out.println(" ");System.out.println("*****************************   *****************************   *****************************"); System.out.println("With Regular for loop:");System.out.println(" ");

        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
            System.out.println(insurances.get(i).toString());
        }
        System.out.println(" ");System.out.println("*****************************   *****************************   *****************************"); System.out.println("With Iterator: ");System.out.println(" ");


        var iterator = insurances.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            item.getQuote();
            item.cancelInsurance();
            System.out.println(item.toString());
                 }
    }//oguzky7
}
