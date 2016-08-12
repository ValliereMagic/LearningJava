
public class Main {

	public static void main(String[] args) {
	intT();
	byteT();
	shortT();
	longT();
	long completedChallenge = challenge();
	System.out.println(completedChallenge);

	}
	public static void intT() {
		// integer has a width of 32
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;
		System.out.println(myMinValue + " and " + myMaxValue);
	}
	public static void byteT() {
		//byte has a width of 8
		byte myMinByteValue = -128;
		byte myMaxValue = 127;
		System.out.println(myMinByteValue + " and " + myMaxValue);
	}
	public static void shortT() {
		//short has a width of 16
		short myShortValue = 32767;
		short myMinValue = -32766;
		System.out.println(myShortValue + " and " + myMinValue);
	}
	public static void longT() {
		// long has a width of 64
		long myLongValue = 100L;
		//HUGE WHOLE NUMBER HERE
		System.out.println(myLongValue);
	}
	public static long challenge() {
		byte byte1 = 100;
		short short1 = 3000;
		int int1 = 900;
		long long1 = (50000L + 10L * (byte1 + short1 + int1));
		return long1;
	}
}