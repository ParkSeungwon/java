//2016110056 박승원
public class star {
	private static void print_star(int count) {
		for(int i=0; i<(7-count)/2; i++) System.out.print(" "); 
		for(int i=0; i<count; i++) System.out.print("*"); 
		System.out.print("\n");
	}
	public static void main(String[] args) {
		int[] n = {1,3,5,7,5,3,1};
		for(int i=0; i<7; i++) print_star(n[i]);
	}
}
