package Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class repl189 {
        public static void main(String[] args) {
            LinkedList<Integer> linked = new LinkedList();

            for(int i = 50; i <= 100; i++) {
                linked.add(i);
            }
            Iterator<Integer> it = linked.iterator();
            while(it.hasNext()) {
                int i = it.next();
                if (i%3 !=0){
                    linked.remove();
                }else{
                  //  System.out.println(linked.get(i));
                }

            }
        }}

