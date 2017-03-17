public class HelloCpp {
	static {
		System.load("/home/zezeon/Programming/java/hellocpp.so");
	}
	public native void callCpp();
	public static void main(String[] args)
	{
		System.out.println("Hello from Java");
		HelloCpp cppInterface = new HelloCpp();
		cppInterface.callCpp();
	}
}

