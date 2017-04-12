class A{
	A(int n) {a_ = n;}
	private int a_;
	public int a() {return a_;}
	public void a(int a_) {this.a_ = a_;}
	class B{}
}
public class tv {
	static public void main(String[] args) {
		television t = new television();
		t.channel = 7;
		System.out.println(t.channel);

		System.out.println(t.square(3));	
		System.out.println(t.square(3.14));	
		System.out.println(t);	

		A a = new A(5);
		System.out.println(a.a());
		a.a(3);
		System.out.println(a.a());

		A.B ab = a.new B();
		int[] arr = new int[5];
	}
}


