package Repl185;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> myArrayList=new ArrayList<>();
        myArrayList.add(111);
        myArrayList.add(111);
        myArrayList.add(111);
        myArrayList.add(999);
        myArrayList.add(999);
        myArrayList.add(999);
        for (Integer number : myArrayList) {
            System.out.println(number);
        }
    }
}