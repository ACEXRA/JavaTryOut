package demo;

public class StaticOverride {
    //Remove static and private then it will work
    private void ready(){
        System.out.println("ready from staticOverride parent");
    }
    public void test(){
        System.out.println("From parent");
    }
    public static void exampleOverride(){
        System.out.println("example from static overrride parent");
    }


}
