package com.sun.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started");
		
		List<String> courses = new CopyOnWriteArrayList<String>();
		courses.add("java");
		courses.add(".net");
		courses.add("c++");
		courses.add("c");
		
		
		
		MyThread mythread = new MyThread(courses);
		new Thread(mythread).start();//new thread started here to execute My Thread run()
		
		Iterator<String> itr = courses.iterator();
		
			while(itr.hasNext()){
				System.out.println("Course : "+itr.next());
				
				Thread.currentThread().sleep(1000);//making main thread to sleep for 1 sec
			}
	}

}
