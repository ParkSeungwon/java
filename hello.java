import java.io.*;
//import java.Exception;
class SimplePair<T1, T2> {
	private T1 a;
	private T2 b;
	public SimplePair(T1 a, T2 b) {
		this.a  = a; this.b = b;
	}
}

public class hello {
	static public void main(String[] args)  {
		Box<String> b = new Box<String>();
		b.set("Hello World!");
		String s = (String) b.get();
		Box<Integer> b2 = new Box<Integer>();
		b2.set(new Integer(10));
		int i = b2.get();
	}
}

