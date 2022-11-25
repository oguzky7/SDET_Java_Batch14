package Practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

    class Main {
        public static void main(String[] args) {
            System.out.println(isBalanced("((()))"));
        }

        public static boolean isBalanced(String str){
            boolean result = false;
            int left = 0;
            int right = 0;

            if (str.length()%2!=0){
                result = false;
            }

            else{
                for (char ch : str.toCharArray()) {
                    if(ch =='(') {
                       left++;
                    }else if(ch ==')') {
                        right++;
                    }
                }
                if(left==right){
                    result = true;
                }
            }
            return result;
        }
    }
