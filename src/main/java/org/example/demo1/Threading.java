package org.example.demo1;

public class Threading extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Threading myThread=new Threading();
        Threading myThread2=new Threading();
        myThread.start();
        myThread2.start();
    }
}
