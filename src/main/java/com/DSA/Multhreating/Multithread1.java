package com.DSA.Multhreating;


class MultithreadingDemo1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread "+Thread.currentThread().getId()+" is Runnig.......");
		
	}
	
}
public class Multithread1 {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		 for(int i=0;i<10;i++)
		 {
			 Thread object
             = new Thread(new MultithreadingDemo1());
			 
         object.start();
         object.sleep(1000);
    
        
		 }
	}
}
