//2016110056 박승원
public class problem6 {
	private static float weight(float h, float w) {
		return w - (h - 100) * 0.9f;
	}
	public static void main(String[] args) {
		int[] h = {153, 164, 180};
		int[] w = {63, 53, 72};
		for(int i=0; i<3; i++) {
			if(weight(h[i], w[i]) > 0) System.out.println("과체중");
			if(weight(h[i], w[i]) == 0) System.out.println("표준체중");
			if(weight(h[i], w[i]) < 0) System.out.println("저체중");
		}
	}
}
