class A<T> extends Thread 
{
	public T a;
	void show() {
		System.out.println(a);
	}
	public void run() {
		for(int i=0; i<10; i++) {
			show();
			try {
				sleep(100);
			} catch(InterruptedException ie) {}
		}
	}
}

public class hello 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!\f");
		int[] a = new int[10];
		for(int i=0; i<10; i++) a[i] = i;
		for(int i : a) System.out.println(i);
		A<String> b = new A<String>();
		A<String> c = new A<String>();
		if(args.length > 1) {
			b.a = args[0];
			c.a = args[1];
		}
		b.start();
		c.start();
	}
}
