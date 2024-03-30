package org.example.demo1;

public class StaticBlock {
    //static block runs before main method
    static {
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
