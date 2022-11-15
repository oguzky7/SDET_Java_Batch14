package HomeWorks;

import java.util.*;

public class class26_HW4 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Turkey");
        countries.add("USA");
        countries.add("England");
        countries.add("Italy");
        countries.add("Greece");
        countries.add("Albania");
        countries.add("Ukraine");
        countries.add("Spain");
        countries.add("Germany");
        System.out.println(countries);
        System.out.println("******************");
        Set<String> alpCountries = new TreeSet<>(countries);
        System.out.println(alpCountries);
        Collections.sort(countries);
        System.out.println(countries);
        //oguzky7
    }
}
