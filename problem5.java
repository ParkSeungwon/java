//2016110056 박승원
public class problem5 {
	public static void main(String[] ar) {
		int n = 0;
		for(int i=1; i<7; i++) for(int j=1; j<7; j++) if(i + j == 6) {
			n++;
			System.out.println(i + " + " + j + " = 6");
		}
	}
}

