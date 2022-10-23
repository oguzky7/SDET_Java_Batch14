package Repl183;

import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<String> myArrayList = new ArrayList<>();
        System.out.println(myArrayList.isEmpty());
        myArrayList.add("Syntax");
        System.out.println(myArrayList.isEmpty());
    }
}