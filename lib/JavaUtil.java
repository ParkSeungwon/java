package lib;
import java.util.*;
import java.io.*;

public class JavaUtil
{
	static public String charAt(String s, int pos, char c) {
		String r = "";
		for(int i=0; i<pos; i++) r += s.charAt(i);
		r += c;
		for(int i=pos+1; i<s.length(); i++) r += s.charAt(i);
		return r;
	}

	static int getInt() {
		Scanner sc = new Scanner(System.in);
		int r=0;
		try {
			r = sc.nextInt();
		} catch(Exception e) {
			System.out.println("정수가 아닙니다.");
		}
		return r;
	}
}
