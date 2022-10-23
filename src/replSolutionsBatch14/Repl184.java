package Repl184;

import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(111);
        myArrayList.add(222);
        myArrayList.add(333);
        myArrayList.add(444);
        myArrayList.add(555);
        myArrayList.add(666);

        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(4));

    }
}