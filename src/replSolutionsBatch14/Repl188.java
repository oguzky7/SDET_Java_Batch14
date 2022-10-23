package Repl188;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        input.close();  // Good practice to save memory
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

