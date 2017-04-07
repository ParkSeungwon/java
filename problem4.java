//2016110056 박승원
public class problem4 {
	private static boolean is_armstrong(int n) {
		int a = n / 100;
		int b = n % 100 / 10;
		int c = n % 10;
		if(a*a*a + b*b*b + c*c*c == n) return true;
		else return false;
	}

	public static void main(String[] args) {
		for(int i=100; i<=500; i++) if(is_armstrong(i)) System.out.println(i + " ");
	}
}

