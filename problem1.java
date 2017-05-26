//2016110056 박승원
import java.util.*;

public class problem1 {
	public static void main(String[] args) {
		try {
			int[] anArray = new int[3];
			System.out.println(anArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			String[] strs = new String[3];
			System.out.println(strs[0].length());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			Integer.parseInt("abc");
			Object o = new Object();
			Integer i = (Integer)o;
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}

