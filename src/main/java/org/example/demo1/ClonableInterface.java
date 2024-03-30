package org.example.demo1;

public class ClonableInterface implements Cloneable {
    int i;
    String s;
    //clonable and serialisable are the only interfaces with no abstract method in it.
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonableInterface obj=new ClonableInterface();
        obj.i=4;
        obj.s="Rasheed";
        ClonableInterface obj2=(ClonableInterface) obj.clone();
        System.out.println(obj2.s);

    }
}
