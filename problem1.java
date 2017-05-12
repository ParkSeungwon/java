//2016110056 박승원
import java.util.*;

class Bike {
	protected int gear;
	public int speed;
}

class MountainBike extends Bike {
	public MountainBike(int g) {
		super();
		gear = g;
	}
	public int seatHeight;
}

public class problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		System.out.println(k);	
		MountainBike m;// = null;// MountainBike(1);
	}
}

