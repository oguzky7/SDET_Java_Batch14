package Practise;

import org.apache.poi.ss.formula.functions.Index;

import javax.lang.model.element.Element;
import java.util.*;

public class repl_219 {
    public static List<Integer> numOfPrefix = new ArrayList<>();
    public static String str;
    public static List<String> wordList = new ArrayList<>(Arrays.asList("steve", "stevens", "danny", "steves", "dan", "john", "johny", "joe", "alex", "alexander"));
    public static List<String> queryWordList = new ArrayList<>(Arrays.asList("steve", "alex", "joe", "john", "dan"));
    public static Map<String, Integer> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(countOnlyPrefixes(wordList, queryWordList));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        map.put("steve", -1);
        map.put("alex", -1);
        map.put("joe", -1);
        map.put("john", -1);
        map.put("dan", -1);
        for (String find : wordList) {
            for (int i = 0; i < queryWordList.size(); i++) {
                str = queryWordList.get(i);

                if (find.contains(str)) {
                    map.put(str, (map.get(str) + 1));
                }
            }
        }
        System.out.println(map);
        for (int i = 0; i < queryWordList.size(); i++) {
            numOfPrefix.add(map.get(queryWordList.get(i)));
        }

        return numOfPrefix;
    }
}
