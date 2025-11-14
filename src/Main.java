//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Song {
    private String title;
    private String artist;
    private int duration;
    private String genre;

    public Song(String title, String artist, int duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public void printSong() {
        System.out.printf("%-20s %-20s %-10d %-10s\n",
                title, artist, duration, genre);
    }
}

public class Playlist {
    private Song[] songs;
    private int size;

    public Playlist(int capacity) {
        songs = new Song[capacity];
        size = 0;
    }

    public void addSong(Song s) {
        if (size < songs.length) {
            songs[size] = s;
            size++;
        } else {
            System.out.println("Playlist is full!");
        }
    }


    public void listSongs() {
        if (size == 0) {
            System.out.println("No songs in the playlist.");
            return;
        }

        System.out.printf("%-20s %-20s %-10s %-10s\n",
                "Title", "Artist", "Duration", "Genre");
        System.out.println("------------------------------------------------------------------");


        for (int i = 0; i < size; i++) {
            songs[i].printSong();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(5);

        playlist.addSong(new Song("One Dance", "Drake", 298, "R&B"));
        playlist.addSong(new Song("Save Your Tears", "The Weeknd", 200, "Pop"));

        playlist.listSongs();
    }
}

git fetch
