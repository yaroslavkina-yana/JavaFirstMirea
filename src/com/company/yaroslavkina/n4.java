package com.company.yaroslavkina;
import java.util.Scanner;
public class n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите аргументы:");
        String input = scanner.nextLine();
        String [] zxc = input.split(" ");
        for (String s : zxc) {
            System.out.println(s);
        }
    }
}

