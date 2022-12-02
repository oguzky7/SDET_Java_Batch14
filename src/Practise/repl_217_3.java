package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
class repl_217_3 {

    public static void main(String[] args ){
        //System.out.println("Hello World");
        List<Integer> Input1 = new ArrayList<>(Arrays.asList(12,12,13,45,78,7,7));
        List<Integer> Input2 = new ArrayList<>(Arrays.asList(12,12,7,7,7,7,7));
        List<Integer> Input3 = new ArrayList<>(Arrays.asList(12,120,13,45,78,17,57));
        List<Integer> Input4 = new ArrayList<>(Arrays.asList(12,12,13,45,78,67,87));
        System.out.println(countDuplicates(Input1));
        System.out.println(countDuplicates(Input2));
        System.out.println(countDuplicates(Input3));
        System.out.println(countDuplicates(Input4));

    }
    static int countDuplicates(List<Integer> numbers){
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num:numbers){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num,1);
            }

        }
          int count = 0;
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            if(entry.getValue()!=1){
                count++;
            }}
       return count;
    }}