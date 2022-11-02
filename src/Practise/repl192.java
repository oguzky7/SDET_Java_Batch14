package Practise;

import java.util.LinkedList;

public class repl192 {
    public static boolean isPrime(int num) {
        boolean isPrime = num >= 2;

        for(int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
        public static void main(String[] args) {
            LinkedList<Integer> primeNumbers = new LinkedList();
            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    primeNumbers.add(i);
                }
            }
            System.out.println(primeNumbers);
        }


        }


