package HomeWorks;

import java.util.HashSet;
import java.util.Set;

public class class26_HW6 {
    String name;
    int studentId;
    public class26_HW6(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("ID: " + studentId);
    }
    @Override
    public String toString() {
        return "class26_HW6{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
    public static void main(String[] args) {
        class26_HW6 student1 = new class26_HW6("Kaan", 72);
        class26_HW6 student2 = new class26_HW6("Koray", 204);
        class26_HW6 student3 = new class26_HW6("John", 375);

        Set<class26_HW6> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students.toString());
        }//oguzky7
    }

