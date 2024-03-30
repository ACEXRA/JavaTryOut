package demo;

public class SingletonClassMain {
    public static void main(String[] args) {
        //singleton class is class that has only one object
        SingletonClass a=SingletonClass.getInstance();
        SingletonClass b=SingletonClass.getInstance();
        if(a==b) System.out.println("Same obj");
    }
}
