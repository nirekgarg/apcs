package apcs;

public class methodsCollaz {


	public static void main(String[] args) {
		long start = 999999999;
		System.out.println("number:" + start);
		while (start != 1) {
			
			if (start % 2 == 0) {
				start = start / 2;
			} else {
				start = (start * 3) + 1;
			}
			System.out.println(start);
		}

	}
	public static void collatz(int start) {
		System.out.println("number:" + start);
		while (start != 1) {
			
			if (start % 2 == 0) {
				start = start / 2;
			} else {
				start = (start * 3) + 1;
			}
			System.out.println(start);
		}
	}

}
