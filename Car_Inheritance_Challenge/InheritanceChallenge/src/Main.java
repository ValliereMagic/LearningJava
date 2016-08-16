
public class Main {

	public static void main(String[] args) {
		SaturnIon Ion = new SaturnIon("White", "Stock", false, false, true);
		System.out.println(Ion.getEngine());
		System.out.println(Ion.getMaxTurningAngle());
		Ion.move(500, 60);
		Ion.turn(60);
		Ion.changeGear(5);
	}

}
