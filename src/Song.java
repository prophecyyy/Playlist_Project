public class Song {
    String name;
    String artist;
    double duration;
    String genre;

    //Constructor
    public Song(String name, String artist, double duration, String genre) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;

        //Method to print song details
        void printSong;(){
            System.out.println(name);
            System.out.println(duration);
            System.out.println(genre);
            System.out.println(artist);
        }
    }
}
