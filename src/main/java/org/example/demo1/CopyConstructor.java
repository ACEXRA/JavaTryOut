package org.example.demo1;

public class CopyConstructor {
    int a;
    int b;
    CopyConstructor(int a,int b){
        this.a=a;
        this.b=b;
    }
    CopyConstructor(CopyConstructor obj){
        this.a=obj.a;
        this.b=obj.b;
    }
    public static void main(String[] args) {
        // send and object to create and copy of the object using constructor
        CopyConstructor obj=new CopyConstructor(2,4);
        //Shallow copy making reference to the object
        CopyConstructor obj1=obj;
        //Deep copy is copying the object to create a new Object
        CopyConstructor obj2=new CopyConstructor(obj);
        System.out.println("Shallow copy : "+obj1.a+" "+obj1.b);
        System.out.println("Deep Copy : "+obj2.a+" "+obj2.b);
    }
}
