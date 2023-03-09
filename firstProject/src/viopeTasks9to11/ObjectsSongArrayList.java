package viopeTasks9to11;

import java.util.ArrayList;
import java.util.List;

import viopeTasks5to8.Song;

public class ObjectsSongArrayList {

	public static void main(String[] args) {

		List<Song> list = new ArrayList<Song>();


		list.add(new Song("Easy on Me", "Adele", 2021));
		list.add(new Song("Shivers", "Ed Sheeran", 2021));
		list.add(new Song("Holy Ghost Fire", "Larkin Poe", 2020));

		System.out.println("=== List of songs ===");
		for (Song Song : list) {
			System.out.println(Song.getArtist() + ": " + Song.getName() + " (" + Song.getYear() + ")");
		}
	}

}
