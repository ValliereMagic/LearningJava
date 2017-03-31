package net.strankgled.maladan;

public class Song {
	
	private String title;
	private double duration;
	//minutes ^^
	
	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
}