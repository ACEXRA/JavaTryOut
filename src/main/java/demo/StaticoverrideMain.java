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

    @Override
    public void test(){
        System.out.println("From Main child");
    }
    public static void exampleOverride(){
        System.out.println("From main");
    }
    public static void main(String[] args) {
        //I am creating a child object using parent reference
        StaticOverride st=new StaticoverrideMain();
        //Normal dynamic polymorphism the right side class object will be created and that class method will run
        st.test();
        //In static method case the reference class method will run this is called method hiding
        st.exampleOverride();

    }
}
