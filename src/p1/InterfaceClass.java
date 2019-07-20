package p1;

public class InterfaceClass implements InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
int balance=1000;
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		
	}

}
