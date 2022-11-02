package Practise;

public class Person {
    String firstName;
    String lastName;
    int birthMonth;
    int birthDay;
    int birthYear;
    String ssn;

    public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }
    public String formatBirthday(){

        return this.birthMonth+"/"+this.birthDay+"/"+this.birthYear;
    }

    public static void main(String[] args) {
        Person p = new Person("John", "Doe",10,25,1900,"123-45-6789");
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.formatBirthday());
        System.out.println(p.getSsn());
    }
}
