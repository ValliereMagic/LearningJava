package net.strankgled.maladan;

import java.util.ArrayList;

public class Album {
	
	private String title;
	private ArrayList<Song> songs = new ArrayList<>();

	public Album(ArrayList<Song> songs, String title) {
		this.songs = songs;
		this.title = title;
	}
	
	public Song getSong(String name) {
		for (Song s : songs) {
			if (s.getTitle().equals(name.toLowerCase())) {
				return s;
			}
		}
		return null;
	}

	public String getTitle() {
		return title;
	}
	
}
