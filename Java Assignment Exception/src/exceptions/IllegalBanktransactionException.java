package exceptions;

@SuppressWarnings("serial")
public class IllegalBanktransactionException extends Exception {



	public IllegalBanktransactionException(String s) {
		System.out.println(s);
	}

}