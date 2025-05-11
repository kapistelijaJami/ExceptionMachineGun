package exceptionmachinegun;

public class ExceptionMachineGun {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			try {
				fireException();
			} catch (StackOverflowError e) {
				System.out.println("RELOADED! " + i);
			}
			i++;
		}
	}
	
	public static void fireException() throws StackOverflowError {
		try {
			int x = 1 / 0;
		} catch (ArithmeticException e) {
			System.err.println(e);
			fireException();
		}
	}
}
