package demo;

//Make the final
//make the field private
//Don't provide setter
//Make all mutable fields finals
//Initialize all the field via constructor by deep copy;
//For getter return immutable objects or deep copy of object rather than actual object

final class ImmutableClass {
    private final int a;
    private final String b;

    ImmutableClass(int a,String b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
