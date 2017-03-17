//2016110056 박승원
import java.util.Scanner;

public class degree {
	public static void main(String[] args) {
		System.out.print("화씨 온도를 입력하시오:");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(d + "F는 " + (double)5 / 9 * (d-32) + "C입니다.");
	}
}

