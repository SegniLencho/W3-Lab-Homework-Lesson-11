public class Main {

	public static void main(String[] args) {

		check();
	}

	static void check() {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "Charlie");
		String s = t.get('c');
		System.out.println(s);
	}

}
