//2016110056 박승원
import java.util.*;

public class problem7 {
	public static void main(String[] args) {
		long a = 0, b = 1, c;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 2; i <= n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}

