package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a*a + b*b == c*c || c*c + b*b == a*a ||a*a + c*c == b*b){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
