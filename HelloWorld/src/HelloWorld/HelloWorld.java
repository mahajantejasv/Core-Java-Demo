package HelloWorld;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World !!!");
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.IntegerDemo();
		helloWorld.ByteDemo();
	}
	
	private void IntegerDemo() {
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println("Max value for integer is " + maxValue);
		System.out.println("Min value for integer is " + minValue);
		System.out.println("Busted Max value for integer is " + (maxValue +1));
		System.out.println("Busted Min value for integer is " + (minValue - 1));
	}
	
	private void ByteDemo() {
		int maxValue = Byte.MAX_VALUE;
		int minValue = Byte.MIN_VALUE;
		System.out.println("Max value for byte is " + maxValue);
		System.out.println("Min value for byte is " + minValue);
		System.out.println("Busted Max value for byte is " + (maxValue +1));
		System.out.println("Busted Min value for byte is " + (minValue - 1));
	}
}
