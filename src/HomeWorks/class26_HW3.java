package HomeWorks;

import java.util.*;

public class class26_HW3 {
    public static void main(String[] args) {
        List<String> dubList = new ArrayList<>();
        dubList.add("john");
        dubList.add("Jane");
        dubList.add("James");
        dubList.add("Jasmine");
        dubList.add("Jane");
        dubList.add("James");
        System.out.println(dubList.toString());
        Set<String> dubRemovedList = new LinkedHashSet<>(dubList);
        System.out.println(dubRemovedList);
        //oguzky7
    }
}
