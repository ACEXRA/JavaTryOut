package demo;

//Singleton class is a class which has one single instance of its class at given time at given JVM
public class SingletonClass {
    //declare a private static final variable creating an instance of class(object).
    private static final SingletonClass instance=new SingletonClass();
    //make your constructor private
    private SingletonClass(){
        System.out.println("THis is a singleton class");
    }
    //create a static method to return the instance of class(object).
    public static SingletonClass getInstance(){
        return instance;
    }
}
