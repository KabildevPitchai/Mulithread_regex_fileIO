package Multithreading;
import java.util.Scanner;

public class ThreadChild1 extends Thread {
	public void run() {
		  //thread job
		/*  for(int no=1;no<=5;no++) {
		   System.out.println("ThreadChild1 "+no);
		  }*/
		
		int no1=20,no2=0;
		try {
		System.out.println(no1/no2);
		}
		catch(ArithmeticException ae){
			System.out.println("print valid no2");
	 		Scanner sc=new Scanner(System.in);
			System.out.println("enter value");
			int no3=sc.nextInt();
			System.out.println(no1/no3);
		}

}
}


//math.power method use it