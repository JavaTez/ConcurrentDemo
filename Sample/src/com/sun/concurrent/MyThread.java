package com.sun.concurrent;

import java.util.List;

public class MyThread implements Runnable{
	
	List<String> courses;
	
	public MyThread(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public void run() {
		System.out.println(" Child Thread executing run method start");
		this.courses.add("Python");
		System.out.println(" Child Thread executing run method end");
	}

}
