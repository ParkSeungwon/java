//2016110056 박승원

class NegativeBalanceException extends Exception {
	public NegativeBalanceException() {
		super("No money");
	}
}
class ClientAccount {
	private int Balance;
	public void withdraw(int money) throws NegativeBalanceException {
		if(Balance < money) throw new NegativeBalanceException();
		else Balance -= money;
	}
	public void deposit(int money) {
		Balance += money;
	}
}

public class problem4 {
	public static void main(String[] args) {
		ClientAccount c = new ClientAccount();
		try {
			c.deposit(100);
			c.withdraw(200);
		} catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

