package HomeWorks;
import java.util.ArrayList;
public class class25_HW1_10_30_2022 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Weather");
        words.add("Car");
        words.add("Sun");
        words.add("Cloud");
        words.add("bike");
        words.add("fire");

        ArrayList<String> wordsToBeRemoved=new ArrayList<>();
        for(String remove:words){
            if(remove.endsWith("e")){
                wordsToBeRemoved.add(remove);
            }
        }
        words.removeAll(wordsToBeRemoved);
        System.out.println(words);

       //Removing with iterator (If the last letter is "r")

        var iterator = words.iterator();

        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.endsWith("r")) {
                iterator.remove();
            }}
        System.out.println(words);
         //oguzky7
    }}
