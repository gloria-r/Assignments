package com.lavenberg;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
//BlockingQueue represents a queue which is thread safe to put elements into, 
//and take elements out from. Multiple threads 
//can be inserting and taking elements concurrently from a Java BlockingQueue, 
//without any concurrency issues arising.
import java.util.concurrent.BlockingQueue;


public class ProducerConsumer {
	 //Create list that we can add or remove items from
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    
    public static void main(String args[])  throws InterruptedException {
       
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    
     Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        //Start threads
        t1.start();
        t2.start();
        
        //.join() puts thread in waiting state. call .join() to make the main program wait for 
        //the threads it has created.
        //Without join(), the main thread would not wait for the two threads to finish.
        t1.join();
        t2.join();
     
    }
    //Create method producer that loops indefinitely
    private static void producer() throws InterruptedException {
        //Allow the loop to select random numbers
        Random random = new Random();
        
        while(true) {
            //Produce random numbers up to 100
            queue.put(random.nextInt(100));
        }
    }
    
    //Consumer method that loops indefinitely
    private static void consumer() throws InterruptedException {
        Random random = new Random();
        
        while (true) {
            //Consumer thread only consumes every once in a while, so it invokes the sleep
            //method for 100 milliseconds and creates 10 loops per seconds
            Thread.sleep(100);
            //It will randomly consume of the producer queue
            //And will do so only 1 out of 10 times on average (.nextInt(10)) == 0, if
            //the random number from 0 to 9 is equal to zero)
            if(random.nextInt(10) == 0) {
                Integer value = queue.take();
                
                System.out.println("Value: " + value + "; Queue size is: " + queue.size());
            }
        }
    }
}

