package com.springmvc.util;

import java.util.concurrent.ThreadLocalRandom;

public class TaskLocalRandom implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s: %d\n", name, ThreadLocalRandom.current().nextInt(10));
		}
	}

	public TaskLocalRandom() {
		ThreadLocalRandom.current();
	}

}
