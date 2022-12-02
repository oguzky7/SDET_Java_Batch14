package Practise;

import java.util.*;

public class repl_218 {



        public static void main(String[] args) {
            //System.out.println(countDeviceNames(Arrays.asList("A","B","C")));
            //countDeviceNames(Arrays.asList("A","B","C","B","C","C","C","D"));
            System.out.println(countDeviceNames(Arrays.asList("A","B","C","B","C","C","C","D")));
        }
        //public static int count;
        public static List<String> outputArray = new ArrayList<>();
        public static List<String> countDeviceNames(List<String> deviceNames) {
            //HashSet<String> repeatedValues = new HashSet<>(deviceNames);
            //System.out.println("REPEATED" +repeatedValues);
            Map<String, Integer> map = new HashMap<>();
        for(String arr:deviceNames){

            if(map.containsKey(arr)){
                map.replace(arr,map.get(arr)+1);
                outputArray.add(arr+(map.get(arr)));
            } else {
                map.put(arr,0);
                outputArray.add(arr);
            }
        }

            //System.out.println(map);
            return outputArray;
    }
}
//    static int countDuplicates(List<Integer> numbers){
//        Map<Integer, Integer> map = new HashMap<>();
//        for(Integer num:numbers){
//            if(map.containsKey(num)){
//                map.put(num, map.get(num)+1);
//            } else {
//                map.put(num,1);
//            }
//
//        }
//        int count = 0;
//        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
//        for(Map.Entry<Integer,Integer> entry:entrySet){
//            if(entry.getValue()!=1){
//                count++;
//            }}
//        return count;

/*
 for (int i=0; i<deviceNames.size(); i++){
            //System.out.println(deviceNames.get(i));

            outputArray.add((deviceNames.get(i)+"1"));
            }
        }
 */