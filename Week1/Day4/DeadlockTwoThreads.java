package com.lavenberg;

public class DeadlockTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// objects on which threads will synchronize		
		String objectOne = "Object One";
		Integer objectTwo = 12;
				
		Thread threadOne = new Thread(new Runnable() {		
			@Override
			public void run() {
				synchronized (objectOne) {
					System.out.println("ThreadOne is in first synchronized block and has acquired first object lock");
					synchronized (objectTwo) {
						System.out.println("ThreadOne is in second synchronized and has acquired second object lock");
					}
				}
			}
		});
		
		Thread threadTwo = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (objectTwo) {
					System.out.println("ThreadTwo is in first synchronized blockand and has acquired second object lock");
					synchronized (objectOne) {
						System.out.println("ThreadTwo is in second synchronized block and has acquired first object lock");
					}
				}
			}
		});
		
		threadOne.start();
		threadTwo.start();
	}
}

