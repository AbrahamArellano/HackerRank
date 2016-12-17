package algorithms.strings;

public class DogShow {

	public static void main(String[] a) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("On");
		} finally {
			int x = 0;
			int y = 7 / x;
		}
		System.out.println("end");
	}
}

class Dog {
	public void bark() {
		System.out.println("woof");
	}
}

class Hound extends Dog {
	public void sniff() {
		System.out.println("sniff");
	}

	public void bark() {
		System.out.println("howl");
	}
}