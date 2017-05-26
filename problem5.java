//2016110056 박승원
import java.io.*;
import java.util.*;
class MyMath<T extends Number> {
	private double sum = 0;
	private int count = 0;
	public void getNum(T a) {
		double d = a.doubleValue();
		sum += d;
		count++;
	}
	public double getAverage() {
		return sum / count;
	}
}

public class problem5 {
	public static void main(String[] ar) throws java.io.IOException {
		MyMath m = new MyMath();
		int[] array = {1,2,3,4,5,6};
		for(int i : array) m.getNum(i);
		System.out.println(m.getAverage());
	}
}

