//2016110056 박승원

public class problem3
{
	
	private static boolean is_palindrom(int n) {
		if(n < 10) return true;
		int i = 1;
		while(i < n) i *= 10;
		i /= 10;
		if(n / i == n % 10) return is_palindrom(n % i / 10);
		else return false;
	}

	static public void main(String[] args) {
		int[] ar = {121, 526625, 362341, 36763, 478230};
		for(int i=0; i<5; i++) if(is_palindrom(ar[i]))
			System.out.println(ar[i] + " is palindrom");
	}
}
