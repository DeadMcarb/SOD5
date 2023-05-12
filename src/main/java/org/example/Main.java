package org.example;

import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private static void run() {
        MyHashTable<Integer> myHashTable = new MyHashTable<>();
        HashSet<Integer> javaHashTable = new HashSet<>();
        Random random = new Random();
        int howMuchToAdd = 10000;


        long start = System.currentTimeMillis();
        for (int i = 0; i <= howMuchToAdd; i++) {
            myHashTable.add(random.nextInt(1, howMuchToAdd));
        }
        long finish = System.currentTimeMillis();
        System.out.println("MyHashTable Time = " + (finish-start));



        start = System.currentTimeMillis();
        for (int i = 0; i <= howMuchToAdd; i++) {
            javaHashTable.add(random.nextInt(1, howMuchToAdd));
        }
        finish = System.currentTimeMillis();
        System.out.println("Java HashSet Time = " + (finish-start));

    }

}