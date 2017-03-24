//2016110056 박승원
public class problem8 {
	private static String[] split(String s) {
		int n = 0;
		for(int i=0; i<s.length(); i++) if(s.charAt(i) == ',') n++;
		String[] sr = new String[n+1];
		n = 0;
		for(int i=0, j=0; i<s.length(); i++) if(s.charAt(i) == ',') {
			sr[j++] = s.substring(n, i);
			n = i+1;
		}
		sr[sr.length-1] = s.substring(n);

		return sr;
	}
	public static void main(String[] args) {
		String s = "abcdef";
		String s2 = "ABCDEF";
		System.out.println(s.length());
		if(s.equals(s2)) System.out.println("equal"); 
		else System.out.println("not equal"); 
		if(s.equalsIgnoreCase(s2)) System.out.println("equal ignore case"); 
		else System.out.println("not equal"); 
		System.out.println(s.charAt(2));
		System.out.println(s.substring(2,5) + " " + s2.substring(2,5));
		String s3 = "abc,def";
		for(String si : split(s3)) System.out.println(si); 
		if(s.indexOf("adf") == 0) System.out.println("starts with adf");
		else System.out.println("does not start with adf"); 
	}
}

