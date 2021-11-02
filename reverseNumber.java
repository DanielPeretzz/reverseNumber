package com.company.danielproject;

import java.util.Scanner;

public class reverseNumber {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number to amount : ");
        int amount = SCANNER.nextInt();
        final int[] arrNum = new int[amount];
        for(int i = 0;i < arrNum.length;i++){
            System.out.print("Please enter a number : ");
            arrNum[i] = SCANNER.nextInt();
        }
        System.out.print("Reverse : ");
        for (int i = (arrNum.length - 1); i >= 0; i--){
            System.out.print(" " + arrNum[i]);
        }


    }
}
