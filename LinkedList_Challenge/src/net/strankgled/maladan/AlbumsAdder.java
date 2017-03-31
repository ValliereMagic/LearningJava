package net.strankgled.maladan;

import java.util.ArrayList;

public class AlbumsAdder {
	
	public static ArrayList<Album> addAlbums() {
		
		ArrayList<Album> albums = new ArrayList<>();
		ArrayList<Song> may_weather = new ArrayList<Song>(){/**
			 * 
			 */
			private static final long serialVersionUID = 4478954056598277785L;

		{
			add(new Song("5 days in may", 5.28));
			add(new Song("shining in the sky", 5.09));
			add(new Song("aoi shiori", 5.38));
			add(new Song("secret base", 5.56));
			add(new Song("last train home", 3.24));
		}};
		albums.add(new Album(may_weather, "may weather"));
		ArrayList<Song> winter_mix = new ArrayList<Song>(){/**
			 * 
			 */
			private static final long serialVersionUID = 15645242L;

		{
			add(new Song("shot in the dark", 5.03));
			add(new Song("clubbed to death", 4.55));
			add(new Song("storytime", 5.29));
			add(new Song("time to say goodbye", 3.25));
			add(new Song("ghost love score", 10.03));
		}};
		albums.add(new Album(winter_mix, "winter mix"));
		return albums;
	}
}
