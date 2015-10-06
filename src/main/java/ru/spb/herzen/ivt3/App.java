package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// I'm Kirill Nikolaev
public class App {
    public static void main(String[] args) {
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("Exercise 1");
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            String name = rnd.next();
            strings.add(name);
        }
        for (String s : strings) {
            System.out.println("Hello, " + s);
        }

        System.out.println("\nExercise 2");
        Collections.sort(strings);
        for (String orderedListEl : strings) {
            System.out.println(orderedListEl);
        }

        System.out.println("\nExercise 3");
        for (int i = 2; i < 5; i++) {
            String el_list = strings.get(i);
            System.out.println("Hello, " + el_list + " " + i);
        }

        System.out.println("\nExercise 4");
        for (String el_up: strings) {
            el_up=el_up.toUpperCase();
            System.out.println(el_up);
        }

        System.out.println("\nExercise 5");
        List<Integer>num_list = new ArrayList<Integer>();
        int amount = 0;
        for (int i=0; i<30; i++) {
            num_list.add((int) (1+Math.random()*100));
            System.out.println(num_list);
            /* if (num_list%2==0) {
                amount +=1;
            }
            */
        }
        System.out.println("Amount of even numbers: " + amount);

        System.out.println("\nExercise 6");
        String my_name = "Kirill";
        List<String>ch_name = new ArrayList<String>();
        // Collections.sort(my_name)
    }
}
