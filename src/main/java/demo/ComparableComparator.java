package demo;

import java.util.Comparator;

public class ComparableComparator implements Comparable<ComparableComparator>{
    int id;
    String name;

    public ComparableComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(ComparableComparator o){
        return this.id - o.id;
    }
    public static Comparator<ComparableComparator> comp=new Comparator<ComparableComparator>() {
    @Override
    public int compare(ComparableComparator o1, ComparableComparator o2) {
        return o1.name.compareTo(o2.name);
    }
};

    @Override
    public String toString(){
        return this.id +"-"+this.name;
    }
}
