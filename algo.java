import java.io.*;
import javax.swing.*;
import java.util.*;

enum Members {Bob, Jerry, Cole};
public class algo {
	static public void main(String[] args) {
		Members m = Members.Bob;
		for(Members me : Members.values()) {
			System.out.println(me);
			System.out.println(m.ordinal());
			System.out.println(Members.valueOf("Bob"));
		}
	}
}

