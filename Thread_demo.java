package Multithreading;

public class Thread_demo {

	public static void main(String[] args) {
		ThreadChild1 tc=new ThreadChild1();
		tc.start(); 
		
		System.out.println(tc.getId());//getId to get the thread position no in program
		tc.setName("kabildev");
		System.out.println(tc.getName());//default name:Thread-0 ,no of threads in program to get specify the number of thread to use it
		tc.setPriority(10);
		System.out.println(tc.getPriority());
		System.out.println(tc.isDaemon());//system get stack error to destroy system so its called Daemon
		System.out.println(tc.isAlive());
		
		//tc.start(); //because can't call this Start method by same object 
		ThreadChild1 tc1=new ThreadChild1();
		tc1.start();
		System.out.println(tc1.getId());
		System.out.println(tc1.getName()); //default name is Thread-1
		System.out.println(tc1.getPriority());
	 	System.out.println(tc1.isDaemon());
		System.out.println(tc1.isAlive());//if we get exception it shows false if u use try catch to get true
		
		
	}

}
//default priority - 5
 