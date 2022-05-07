package com.company;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bulb = scn.nextInt();
        for (int i =1 ; i * i <= bulb; i++){
            System.out.println(i*i);
        }
    }
}
