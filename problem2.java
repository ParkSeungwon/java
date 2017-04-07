//2016110056 박승원

public class problem2 
{
	private static boolean is_complete(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) if(n % i == 0) sum += i;
		if(n == sum) return true;
		else return false;
	}
	static public void main(String[] args) {
		for(int i=1; i<501; i++) if(is_complete(i)) System.out.print(i + " "); 
	}
}
