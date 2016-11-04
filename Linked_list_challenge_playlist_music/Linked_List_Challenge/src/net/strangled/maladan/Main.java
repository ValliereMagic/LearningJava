package net.strangled.maladan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<>();
	private static LinkedList<Song> playlist = new LinkedList<>();
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean running = true;
		albums.add(addSummerMixSongs());
		albums.add(addFallMixSongs());
		while(running) {
			getInstructions();
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			input.nextLine();
			switch(choice) {
				case 1:
					listAllSongs();
					break;
				case 2:
					Song userSong = getSongsFromAlbum(getAlbum());
					if(userSong != null) {
						playlist.add(userSong);
					} else {
						System.out.println("An error occured and the song was not added.");
					}
					break;
				case 3:
					System.out.println("Enter the name of the album you would like to add to the playlist (in lower case): ");
					String albumName = input.nextLine();
					Album album = getAlbum(albumName);
					//Ask about the efficiency in this statement.
					ArrayList<Song> temp = new ArrayList<>();
					for(Song t : album.getSongs()) {
						for(Song s : playlist) {
							if(t == s) {
								temp.add(s);
							}
						}
					}
					if(!temp.isEmpty()) {
						for(Song s : temp) {
							album.getSongs().remove(s);
						}
					}
					//End this efficiency question
					playlist.addAll(album.getSongs());
					break;
				case 4:
					System.out.println("The current songs in the playlist are: ");
					for(Song s : playlist) {
						System.out.println("===================");
						System.out.println(s.getTitle());
						System.out.println("===================");
					}
					break;
			}
		}
	}
	private static Album addSummerMixSongs() {
		ArrayList<Song> summerMixSongs = new ArrayList<>();
		summerMixSongs.add(new Song("Ghosts of Paraguay", 5));
		summerMixSongs.add(new Song("Cat Food", 5));
		summerMixSongs.add(new Song("Melancholic", 5));
		summerMixSongs.add(new Song("Fade", 5));
		summerMixSongs.add(new Song("Breathe", 5));
		summerMixSongs.add(new Song("Bad side of the moon", 5));
		summerMixSongs.add(new Song("Bad Reputation", 5));
		return new Album(summerMixSongs, "Summer Mix");
	}
	private static Album addFallMixSongs() {
		ArrayList<Song> fallMixSongs = new ArrayList<>();
		fallMixSongs.add(new Song("Hand in hand", 5));
		fallMixSongs.add(new Song("Cool Kids", 5));
		fallMixSongs.add(new Song("Catastrophe", 5));
		fallMixSongs.add(new Song("Tank", 5));
		fallMixSongs.add(new Song("Can't defeat Airman", 5));
		fallMixSongs.add(new Song("This is Halloween", 5));
		fallMixSongs.add(new Song("Overtime", 5));
		fallMixSongs.add(new Song("Surrender", 5));
		return new Album(fallMixSongs, "Fall Mix");
	}
	private static void getInstructions() {
		System.out.println("Pleace pick an option below: ");
		System.out.println("1.) List all songs that are available.");
		System.out.println("2.) Add a song to the playlist.");
		System.out.println("3.) Add an entire album to the playlist");
		System.out.println("4.) List all the current songs in the playlist.");
	}
	private static void listAllSongs() {
		for(Album a : albums) {
			System.out.println("--------------------");
			System.out.println(a.getName());
			System.out.println("--------------------");
			
			for(Song s : a.getSongs()) {
				System.out.println("===================");
				System.out.println(s.getTitle());
				System.out.println(s.getDuration());
				System.out.println("===================");
			}
		}
	}
	private static void listSongsInAlbum(Album album) {
		for(Song s : album.getSongs()) {
			System.out.println("===================");
			System.out.println(s.getTitle());
			System.out.println(s.getDuration());
			System.out.println("===================");
		}
	}
	private static Album getAlbum() {
		boolean test = false;
		Album userAlbum = null;
		while(!test) {
			System.out.println("Enter the album name in lower case that the song is in.");
			String albumName = input.nextLine();
			for(Album a : albums) {
				if(a.getName().toLowerCase().equals(albumName)) {
					userAlbum = a;
				}
			}
			if(userAlbum == null) {
				System.out.println("That album does not exist.");
			} else {
				test = true;
			}
		}
		return userAlbum;
	}
	private static Album getAlbum(String albumName) {
		boolean test = false;
		Album userAlbum = null;
		while(!test) {
			for(Album a : albums) {
				if(a.getName().toLowerCase().equals(albumName)) {
					userAlbum = a;
				}
			}
			if(userAlbum == null) {
				System.out.println("That album does not exist.");
			} else {
				test = true;
			}
		}
		return userAlbum;
	}
	private static Song getSongsFromAlbum(Album userAlbum) {
		Song userSong = null;
		boolean songs = false;
		while(!songs) {
			System.out.println("Enter the name from the list below: ");
			listSongsInAlbum(userAlbum);
			System.out.println("Enter your choice: ");
			String songName = input.nextLine();
			for(Song s : userAlbum.getSongs()) {
				if(s.getTitle().toLowerCase().equals(songName)) {
					userSong = s;
				}
			}
			if(userSong == null) {
				System.out.println("That song does not exist.");
			} else {
				songs = true;
			}
		}
		return userSong;
	}

}
