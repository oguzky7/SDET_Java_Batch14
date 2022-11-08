package HomeWorks.class26_HW1_6;

import java.util.ArrayList;

public abstract class Insurance {

    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
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
        }}
class Health extends Insurance{
            Health(String insuranceName){
                super(insuranceName);
            }
            void getQuote(){
                System.out.println("Health insurance");
            }
            void cancelInsurance(){
            }
}
class InsuranceTest {
    public static void main(String[] args) {

        Car car = new Car("Geico", "Chevrolet");
        Pet pet = new Pet("Healty Paws", "Golden");
        Health health = new Health("Allianz");
        int Insurance = 0;
        ArrayList<Insurance> list = new ArrayList<>(Insurance);

        list.add(car);
        list.add(pet);
        list.add(health);

        System.out.println("Enhanced for loop");
        for (Insurance ins:list) {
            ins.getQuote();
            ins.cancelInsurance();
        }
        System.out.println(" ");
        System.out.println("Regular for loop");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).getQuote();
            list.get(i).cancelInsurance();
        }
    }
}
