//2016110056 박승원
import java.io.*;
public class problem5 {
	public static void main(String[] ar) throws java.io.IOException {
		String s;
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
			while((s = in.readLine()) != null) out.write(s + "\n");
			in.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
		}
	}

}

