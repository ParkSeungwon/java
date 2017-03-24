public class Hello {
	public static void main(String[] args) {
		double x=Double.POSITIVE_INFINITY, y=Double.NEGATIVE_INFINITY;
		double z=Double.MAX_VALUE;
		System.out.println(" POSITIVE_INFINITY + POSITIVE_INFINITY = " + (x+x));
		System.out.println(" POSITIVE_INFINITY - POSITIVE_INFINITY = " + (x-x));
		System.out.println(" POSITIVE_INFINITY + NEGATIVE_INFINITY = " + (x+y));
		System.out.println(" POSITIVE_INFINITY * 0.0 = " + (x*0.0));
		System.out.println(" Double.MAX_VALUE / POSITIVE_INFINITY = " + (z / x));
		System.out.println(" 3.0 / 0.0 = " + (3.0/0.0));
		System.out.println(10 >>> 1);
	}
}
