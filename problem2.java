//2016110056 박승원
import java.util.*;

class OwnException extends Exception {
	public OwnException() {
		super("My Own Exception threw");
	}
}

public class problem2 {
	public static void throwExceptMethod() throws OwnException {
		throw new OwnException();
	}

	public static void main(String[] args) throws OwnException {
		throwExceptMethod();
	}
}

