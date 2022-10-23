package Repl169;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(new Main().avgElements(a)); //should print 4.8
    }
    final  double avgElements(int[] a){
       return Double.valueOf(Arrays.stream(a).sum())/(double)a.length;

    }
}