package com.DSA.Multhreating;



class MultithreadingDemo extends Thread

{
	public void run() {
		try {
			//System.out.println("Thread "+Thread.currentThread().getId()+" is running!!!!!!!!!!!!");
			System.out.println("Thread "+Thread.currentThread().getId()+" is running!!!!!!!!!!!!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for (int i=0;i<n;i++)
		{
			MultithreadingDemo object=new MultithreadingDemo();
			object.start();
		}

	}

}
