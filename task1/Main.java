package ru.mirea.lab28.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("val3");
        hashSet.add("val1");
        hashSet.add("val2");

        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new java.util.TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}

