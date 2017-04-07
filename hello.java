import java.io.*;

public class hello 
{
	int i;
	public static void main(String[] args) throws java.io.IOException
	{
		System.out.print("*** input data : ");
		System.out.println("*** read data : " + readInt() + " " + readInt());

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		System.out.println(str);	
	}

	static int readInt() throws java.io.IOException {
		char ch;
		int n = 0;
		while(Character.isDigit(ch=(char)System.in.read())) n = n*10+(ch-'0');
		return n;
	}
}
