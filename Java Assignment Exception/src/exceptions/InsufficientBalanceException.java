package exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Throwable {



	public InsufficientBalanceException(int newBalance) {
		System.out.println(newBalance);
	}

}