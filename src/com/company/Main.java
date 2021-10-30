package com.company;

import java.util.Scanner;

public class Main {
    private static int num;
    private static String EQUAL = " = ";
    private static String SIGN = " x ";


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        num= sc.nextInt();

        for(int i = 1; i <=12; i++)
        {
                System.out.println(num + SIGN + i + EQUAL + i * num);
        }

    }
}
