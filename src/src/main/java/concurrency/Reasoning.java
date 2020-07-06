package concurrency;

public class Reasoning extends Thread{
	
//	class Reasoning {
//	    //set up this class so it can become a valid thread. 
//	    void distinguish() {
//	        //print to the console the difference between a thread and a process
//	        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
//	    }
//	}

	public void run() {
		
		
		System.out.println("Thread is nothing but a flow of execution where as a process is"
				+ "a program under execution");
	}
	
	

}
