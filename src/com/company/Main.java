package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean done = false;
        Scanner sc = new Scanner(System.in);
//        int multiples;
        int count;

        while (done != true) {
            System.out.print("Insert an ending number: ");
            int endingNumber = sc.nextInt();
            sc.nextLine();


            for (int x = 1; x < endingNumber; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.print("FizzBuzz");
                    System.out.print("\n");
                } else {

                    if (x % 3 == 0) {
                        //multiples_of_3 = x * 3;
                        System.out.print("Fizz");
                        System.out.print("\n");
                    } else if (x % 5 == 0) {
                        System.out.print("Buzz");
                        System.out.print("\n");
                    } else {
                        System.out.print(x);
                        System.out.print("\n");
                    }
                }
            }
            System.out.print("\n");
//            Number of multiples out of the submitted ending number.
//            count = Integer.bitCount(endingNumber);
            System.out.print("Multiples of 7 are: " );
            for (int multiplesOf7 = 1; multiplesOf7 < endingNumber; multiplesOf7++) {
                    if (multiplesOf7 % 7 == 0) {
                        System.out.print("\t" + multiplesOf7);
                    } else {
                        done = true;
                    }
            } System.out.print("\n");
            System.out.print("Multiples of 17 are: ");
            for (int multiplesOf17 = 1; multiplesOf17 < endingNumber; multiplesOf17++ ) {

                if (multiplesOf17 % 17 == 0) {
//                        System.out.print("There are " + count + " multiples of 17.");
                    System.out.print("\t" + multiplesOf17);
                } else {
                    done = true;
                }
            } System.out.print("\n");
            System.out.print("Multiples of 23 are: ");
            for (int multiplesOf23 = 1; multiplesOf23 < endingNumber; multiplesOf23++) {
                 if (multiplesOf23 % 23 == 0) {
//                        System.out.print("There are " + count + " multiples of 23.");
                     System.out.print("\t" + multiplesOf23);
                 } else {
                     done = true;
                 }
            } System.out.print("\n");
//            System.out.print("\n");
//            System.out.println("There are " + count + " multiples of 7.");
//            System.out.print("\n");
//            System.out.println("There are " + count + " multiples of 17.");
//            System.out.print("\n");
//            System.out.println("There are " + count + " multiples of 23.");
        }
    }
}
