package algorithms.strings;

public class Tenor extends Singer {

	public static String sing() {
		return "la";
	}

	public static void main(String[] ag) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
}

class Singer {
	public static String sing() {
		return "re";
	}
}