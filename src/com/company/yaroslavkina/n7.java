package com.company.yaroslavkina;
public class n7 {
    public static void main(String[] args) {
        int x = 7;
        long factorial = calculateFactorial(x);
        System.out.println("Факториал числа " + x + " равен " + factorial);
    }
    public static long calculateFactorial(int x) {
        long result = 1;
        for (int i =1; i <=x; i++){
        result = result * i;
    }
     return result;
    }
}
