package demo;

public class StaticoverrideMain extends StaticOverride{
    //You cannnot override static and private methods
//    @Override
//    public void ready(){
//        System.out.println("From main");
//    }
//    @Override
//    public void exampleOverride(){
//        System.out.println("From main");
//    }

    //If you use same name static method then call from child class child one will run it called method hiding
    //Also if you call from parent, parent method will run
    public static void exampleOverride(){
        System.out.println("From main");
    }
    public static void main(String[] args) {
        StaticoverrideMain.exampleOverride();
        StaticOverride.exampleOverride();

    }
}
