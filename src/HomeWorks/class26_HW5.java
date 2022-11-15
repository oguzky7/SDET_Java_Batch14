package HomeWorks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class class26_HW5 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Amsterdam"); cities.add("Barcelona"); cities.add("Beirut");
        cities.add("Cape Town"); cities.add("Ankara"); cities.add("Agra");
        cities.add("Kiev"); cities.add("Madrid"); cities.add("Paris");

        System.out.println(cities);
        System.out.println("********************");

        cities.removeIf(x -> x.startsWith("A") || x.startsWith("a"));
        System.out.println(cities);

        cities.add("Ankara");
        cities.add("Agra");
        cities.add("Amsterdam");

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            var item = iterator.next();
            if(item.startsWith("A") || item.startsWith("a")){
                iterator.remove();
            }}//oguzky7
        System.out.println(cities);
    }}
