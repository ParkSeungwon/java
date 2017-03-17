//2016110056 박승원
import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		System.out.print("마일을 입력하시오:");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.println(d + "마일은 " + d * 1.609 + "킬로미터입니다.");
	}
}

