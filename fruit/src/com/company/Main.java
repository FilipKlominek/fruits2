package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vegetables");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " vegetables");
        ArrayList<String> vegetables = new ArrayList<String>();
        for (int i = 0; i <= n; i++) {
            String nextV = sc.nextLine().toLowerCase();
            if (vegetables.contains(nextV)) {
                System.out.println("Duplicate");
                i -= 1;
            }
            else vegetables.add(nextV);
        }

        System.out.println("Enter number of fruits");
        int m = sc.nextInt();
        System.out.println("Enter " + m + " fruits");
        ArrayList<String> fruits = new ArrayList<String>();
        for (int i = 0; i <= m; i++) {
            String nextF = sc.nextLine().toLowerCase();
            if (fruits.contains(nextF)) {
                System.out.println("Duplicate");
                i -= 1;
            }
            else fruits.add(nextF);
        }
        
        String input = sc.nextLine().toLowerCase();
        while (!input.equals("END")) {

            if (vegetables.contains(input)) System.out.println("vegetable");
            else if (fruits.contains(input)) System.out.println("fruit");
            else System.out.println("other");


            input = sc.nextLine().toLowerCase();
        }
    }
}
