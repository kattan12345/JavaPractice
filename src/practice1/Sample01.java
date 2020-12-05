package practice1;

public class Sample01 {
	int i = 0;
	static int num = 0;

	public void test() {
		while( i < 3 ) {
			i++;
			num++;
		}
	}

	public static void main(String[] args) {
		Sample01 a = new Sample01();
		Sample01 b = new Sample01();

		a.test();
		b.test();

		System.out.println(a.num + " : " + b.num);
	}
}
