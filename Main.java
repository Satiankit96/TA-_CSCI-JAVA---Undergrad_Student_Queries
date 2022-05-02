package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int temp = scn.nextInt();
        int count = 1;
        int pos =0;
        while(temp!=0){
            int rem = temp%10;
            temp/=10;
            pos +=count* ((int)Math.pow(10,rem-1));
            count++;
        }
        System.out.println(pos);
    }
}
