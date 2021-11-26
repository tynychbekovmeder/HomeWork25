package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer>set1=new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new LinkedHashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer>set=new LinkedHashSet<>(set2);
        set.removeAll(set1);
        set1.removeAll(set2);
        set.addAll(set1);
        return set;
    }
}
