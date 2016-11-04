package net.strangled.maladan;

import java.util.ArrayList;

public class Album {
	private ArrayList<Song> songs = new ArrayList<>();
	private int numberOfSongs;
	private String name;
	public Album(ArrayList<Song> songs, String name) {
		this.songs.addAll(songs);
		this.numberOfSongs = this.songs.size();
		this.name = name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public String getName() {
		return name;
	}
	
}
