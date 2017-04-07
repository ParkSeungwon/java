//2016110056 박승원
import java.util.Scanner;

public class problem1 {
	static private boolean is_prime(int n) {
		for(int i=2; i<=n/2; i++) if(n % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		for(int i=2; i<100; i++) if(is_prime(i)) System.out.print(i + " "); 
	}
}

