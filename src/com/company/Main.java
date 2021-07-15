package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();
        int count = 1;
        for(int i = 0; i< num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.print("\n");
        }
    }
}
