//2016110056 박승원
import java.io.*;
public class problem7 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output3.txt"));
		String s;
		while((s = in.readLine()) != null) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ' ' || s.charAt(i) == ',') out.write("\n");
				else out.write(s.charAt(i));
			}
			out.write("\n");
		}
		in.close();
		out.close();
	}
}
