package net.strangled.maladan;

public class Main {

	public static void main(String[] args) {
		Chair chair = new Chair("black", "cotton", 0);
		CouchSize couchsize = new CouchSize(5, 10);
		Couch couch = new Couch("cotton", "black", couchsize, 0);
		Floor floor = new Floor("Hardwood Maple", 5, "beige", 4);
		Lamp lamp = new Lamp(14, 4, "Silver");
		LivingRoom livingRoom = new LivingRoom(floor, couch, chair, lamp);
		printChairState(livingRoom);
		livingRoom.changeChairState(-1, 5);
		printChairState(livingRoom);
		livingRoom.changeChairState(1, 10);
		printChairState(livingRoom);
		
		System.out.println(livingRoom.getFloor().getFilth());
		livingRoom.getFloor().droppedItemOnFloor();
		System.out.println(livingRoom.getFloor().getFilth());
	}
	public static void printChairState(LivingRoom livingRoom){
	System.out.println(livingRoom.getChair().getCleanliness());
	}
}
