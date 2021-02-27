package com.lavenberg;


public class Singleton {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                A obj1 = A.getInstance();
    }
});

        Thread t2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
            A obj1 = A.getInstance();
    }
});

    t1.start();
    t1.start();
    }
    }
    

class A {
    public static A obj;
    
    private A() {
        System.out.println("Instance Created");
    }
    
    public static A getInstance() { //double checked locking
        if(obj == null) {
            synchronized (A.class) {
                if(obj == null)
                obj = new A();
            }
        }
        return obj;
    }
}

