package Practise;

import java.util.Arrays;

public class repl_216 {
    public static int[] arraySumToZero(int N) {
        int[] myArr = new int[N];
       if (N % 2 == 0) {
            for(int i =0; i<N/2; i++) {
                myArr[i] = -i+(N/2);
                myArr[N-(1+i)] = i-(N/2);
            }
        } else if (N % 2 == 1) {
            for(int i =0; i<N/2; i++) {
                myArr[i] = -i+((N-1)/2);
                myArr[(N-1)/2]=0;
                myArr[(N-1)-(1+i)] = i-((N-1)/2);
            }
        }
        return myArr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arraySumToZero(0)));

    }
}

