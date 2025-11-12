public class Song {
    String name;
    String artist;
    double duration;
    String genre;

    // Constructor
    public Song(String name, String artist, double duration, String genre) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    // Method to print song details
    public void printSong() {
        System.out.println("Name: " + name);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration);
        System.out.println("Genre: " + genre);
    }
}

