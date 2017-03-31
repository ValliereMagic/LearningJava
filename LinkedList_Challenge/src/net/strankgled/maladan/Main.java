package net.strankgled.maladan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = AlbumsAdder.addAlbums();
	private static Scanner scanner = new Scanner(System.in);
	private static LinkedList<Song> playlist = new LinkedList<>();
	private static boolean goingForward = true;
	
	public static void main(String[] args) {
		addSongs();
		playSongs();
	}
	
	private static void addSongs() {
		Instructions.printAddSongInstructions();
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Enter the name of the album you are choosing from");
					String albumName = scanner.nextLine();
					Album chosenAlbum = getAlbum(albumName);
					if (chosenAlbum != null) {
						System.out.println("Enter the name of the song you want to pick from the album");
						String songName = scanner.nextLine();
						Song chosenSong = chosenAlbum.getSong(songName);
						if (chosenSong != null) {
							playlist.add(chosenSong);
							System.out.println("Added: " + chosenSong.getTitle() + " successfully.");
						} else {
							System.out.println("Song does not exist.");
						}
					} else {
						System.out.println("Album does not exist.");
					}
					break;
				case 2:
					Instructions.printAddSongInstructions();
					break;
			}
		}
	}
	
	private static Album getAlbum(String name) {
		for (Album s : albums) {
			if (s.getTitle().equals(name.toLowerCase())) {
				return s;
			}
		}
		return null;
	}
	
	private static void playSongs() {
		boolean quit = false;
		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.isEmpty()) {
			System.out.println("No songs in the list.");
			return;
		} else {
			System.out.println("Now Playing: " + listIterator.next().getTitle());
			Instructions.printPlayingInstructions();
			while (!quit) {
				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
					case 0:
						System.out.println("Done playing songs.");
						quit = true;
						break;
					case 1:
						if (!goingForward) {
							goForwardsIfNot(listIterator);
							goingForward = true;
						}
						if (listIterator.hasNext()) {
							System.out.println("Now Playing: " + listIterator.next().getTitle());
						} else {
							playListEnded();
						}
						break;
					case 2:
						if (goingForward) {
							goBackwardsIfNot(listIterator);
							goingForward = false;
						}
						if (listIterator.hasPrevious()) {
							System.out.println("Now Playing: " + listIterator.previous().getTitle());
						} else {
							playListBeginning();
						}
						break;
					case 3:
						if (goingForward) {
							if (listIterator.hasPrevious()) {
								String songName = listIterator.previous().getTitle();
								listIterator.remove();
								successfullyRemovedSong(songName);
							} else {
								failedToRemoveSong();
							}
						} else if (!goingForward) {
							if (listIterator.hasNext()) {
								String songName = listIterator.next().getTitle();
								listIterator.remove();
								successfullyRemovedSong(songName);
							} else {
								failedToRemoveSong();
							}
						}
						break;
					case 4:
						Instructions.printPlayingInstructions();
						break;
				}
			}
		}
	}
	
	private static void successfullyRemovedSong(String songName) {
		System.out.println("Removed: " + songName + " successfully;");
	}
	
	private static void failedToRemoveSong() {
		System.out.println("Removing the song failed.");
	}
	
	private static void goForwardsIfNot(ListIterator<Song> listIterator) {
		if (listIterator.hasNext()) {
			listIterator.next();
		}
	}
	
	private static void goBackwardsIfNot(ListIterator<Song> listIterator) {
		if (listIterator.hasPrevious()) {
			listIterator.previous();
		}
	}
	
	private static void playListEnded() {
		System.out.println("Reached the end of the playlist.");
		goingForward = false;
	}
	
	private static void playListBeginning() {
		System.out.println("Reached the start of the playlist.");
		goingForward = true;
	}

}
