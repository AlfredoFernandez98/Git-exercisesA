package org.example;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        printNumbers(5,10);

        for (int i = 1; i <= 200; i++) {
=======
        for (int i = 1; i <= 100; i++) {
>>>>>>> parent of 71963ad (Commit 1)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BuzzFizz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
    public static void printNumbers(int start, int end){
        for(int i = start; i<= end; i++){
            System.out.println(i);
        }

    }
