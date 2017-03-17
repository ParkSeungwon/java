//2016110056 박승원
public class literal {
	public static void main(String[] args) {
		double d = 5E-5;
		float f = 5E-5f;//기본적으로 double이므로 f를 붙여줘야 함.
		long l = 9223372036854775807L;//int가 기본이므로 long형은 L을 붙여야 함.
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
	}
}

