package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        //String msg = "Test 1";
        //System.out.println(msg);

//        BufferedReader inFile;
//        PrintWriter outFile;
//        inFile = new BufferedReader(new FileReader("infile.dat"));
//        outFile = new PrintWriter(new FileWriter("outFile.dat"));
//
//        int number;
//        int[] value;
//        value = new int[1000];
//        for (number = 0; number < 1000; number++)
//            value[number] = Integer.parseInt(inFile.readLine());
//        for (number = 999; number >= 0; number--)
//            outFile.println(value[number]);


        Player one = new Player("Mike", 5);
        System.out.println(one.getName());
        System.out.println(one.getLevel());
        System.out.println(one.getWeapon().getName());

        Player two = new Player("Bob");
        System.out.println(two.getName());
        two.setName("Bob");
        System.out.println(two.getName());

        Player three = new Player("John");
        System.out.println(three.getName());
        three.setName("John");
        System.out.println(three.getName());

        Player four = new Player("John");
        System.out.println(four.getName());
        four.setName("John");
        System.out.println(four.getName());


    }
}
