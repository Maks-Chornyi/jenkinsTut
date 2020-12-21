public class HelloWorld {
	public static void main(String [] args) throws Exception {
		for (int i = 0; i < 5; i++) {
			System.out.println("HelloWorld " + i);
			Thread.sleep(1000);
		}
	}
}
