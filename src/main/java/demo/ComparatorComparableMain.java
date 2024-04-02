package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorComparableMain {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("rasheed");
        arr.add("luffy");
        arr.add("sanji");
        arr.add("asklad");
        Collections.sort(arr);
        System.out.println(arr);
        ArrayList<ComparableComparator> arr2=new ArrayList<>();
        arr2.add(new ComparableComparator(1,"Luffy"));
        arr2.add(new ComparableComparator(5,"Sanji"));
        arr2.add(new ComparableComparator(2,"Zoro"));
        arr2.add(new ComparableComparator(9,"Robin"));
        arr2.add(new ComparableComparator(4,"Nami"));
        Collections.sort(arr2,ComparableComparator.comp);
        System.out.println(arr2);
    }
}
