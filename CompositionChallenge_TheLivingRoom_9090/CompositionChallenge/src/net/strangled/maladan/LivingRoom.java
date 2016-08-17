package net.strangled.maladan;

public class LivingRoom {
	private Floor floor;
	private Couch couch;
	private Chair chair;
	private Lamp lamp;
	public LivingRoom(Floor floor, Couch couch, Chair chair, Lamp lamp) {
		super();
		this.floor = floor;
		this.couch = couch;
		this.chair = chair;
		this.lamp = lamp;
	}
	public Floor getFloor() {
		return floor;
	}
	public Couch getCouch() {
		return couch;
	}
	public Chair getChair() {
		return chair;
	}
	public Lamp getLamp() {
		return lamp;
	}
	public void changeChairState(int type, int state) {
		if(type == -1) {
			dirtyTheChair(state);
		} else if(type == 1) {
			cleanTheChair(state);
		}
	}
	private void dirtyTheChair(int filth) {
		chair.couchFilthIncrease(filth);
	}
	private void cleanTheChair(int clean) {
		chair.couchFilthDecrease(clean);
	}
}
