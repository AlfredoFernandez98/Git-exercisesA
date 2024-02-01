package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Hulu");
            } else if (i % 3 == 0) {
                System.out.println("Bulu");
            } else if (i % 5 == 0) {
                System.out.println("HuluBulu");
            } else {
                System.out.println(i);
            }
        }
    }
    }