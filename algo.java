import java.io.*;
import javax.swing.*;
import java.util.*;
import java.lang.Thread.*;

class Buffer {
	private int data;
	private boolean empty = true;
	public synchronized int get() {
		while(empty) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		empty = true;
		notifyAll();
		return data;
	}
	public synchronized void put(int n) {
		while(!empty) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		data = n;
		empty = false;
		notifyAll();
	}
}

class MyThread implements Runnable {
	private Buffer buffer;
	public MyThread(Buffer b) {
		buffer = b;
	}
	public void run() {
		for(int i=0; i<10; i++) System.out.println(buffer.get()); 
	}
}

class MTh extends Thread {
	private Buffer buffer;
	public MTh(Buffer b) {
		buffer = b;
	}
	public void run() {
		for(int i=0; i<10; i++) buffer.put(i);
	}
}

public class algo {
	static public void main(String[] args) {
		Buffer b = new Buffer();
		Thread mt = new Thread(new MyThread(b));
		MTh m = new MTh(b);
		mt.start();
		m.start();
	}
}

