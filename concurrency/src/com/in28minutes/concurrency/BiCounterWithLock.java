package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		lockForI.lock();//Get Lock For I
		i++; //15
		lockForI.unlock();
		//Release Lock For I
	}

	public int getI() {
		return i;
	}
	
	public void incrementJ() {
		lockForJ.lock();//Get Lock For J
		j++; //15
		lockForJ.unlock();//Release Lock for J
	}

	public int getJ() {
		return j;
	}
	
}
