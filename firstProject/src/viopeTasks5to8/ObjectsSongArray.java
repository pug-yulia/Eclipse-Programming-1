package viopeTasks5to8;

public class ObjectsSongArray {

	public static void main(String[] args) {
		
		Song[] array = new Song[3];
		
		array[0] = new Song("Easy on Me", "Adele", 2021);
        array[1] = new Song("Shivers", "Ed Sheeran", 2021);
        array[2] = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
        
        System.out.println("=== List of songs ===");
        for (Song Song : array) {
        	System.out.println(Song.getArtist() + ": " + Song.getName() + " (" + Song.getYear() + ")");
        }
        
	}

}
