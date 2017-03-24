//2016110056 박승원
public class problem4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) if(i % 3 == 0 || i % 4 == 0) sum += i;
		System.out.println(sum);
	}
}

