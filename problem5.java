//2016110056 박승원
import java.io.*;
import java.util.*;
public class problem5 {
	static String trim(String s, int pos) {//return the part pos is located
		String r = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				if(i<pos) r = "";
				else return r;
			} else r += s.charAt(i);
		}
		return r;
	}

	public static void main(String[] ar) throws java.io.IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("찾을 파일명을 입력하세요 :");
		String file = br.readLine();
		String s, t="";
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			while((s = in.readLine()) != null) t += s;
			in.close();
		} catch(IOException e) {
			System.out.println("그런 파일은 없습니다.");
			return;
		}
		System.out.print("찾을 문자열을 입력하세요(comma로 구문을 띄우세요) :");
		String search = br.readLine();
		br.close();
		String[] strim = new String[10];
		String[] to_find = search.split(",");

		//for(int i=0; i<t.length(); i++) t.charAt(i);
		for(String s2 : to_find) {
			int ppos=-1, occur=0;
			while((ppos = t.indexOf(s2, ppos+1)) != -1) {
				strim[occur] = trim(t, ppos);
				occur++;
			}
			System.out.print(s2 + "는 " + occur + "개 : ");
			for(int i=0; i<occur; i++) System.out.print(strim[i] + " ");
			System.out.println();
		}
	}

}

