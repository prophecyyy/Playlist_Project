import java.util.Scanner;

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

class PlaylistApp {

    private static final int MAX_SONGS = 10;

    private static Song[] songs = new Song[MAX_SONGS];

    private static int count = 0;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            printMenu();

            choice = readInt("Choose an option: ");

            switch (choice) {

                case 1:
                    addSong();
                    break;

                case 2:
                    listSongs();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }

        } while (choice != 0);

    }

    private static void printMenu() {
        System.out.println("\n--- Playlist Menu ---");
        System.out.println("1 - Add a new song");
        System.out.println("2 - List all songs");
        System.out.println("0 - Exit");
    }

    private static void addSong() {

        if (count >= MAX_SONGS) {
            System.out.println("Playlist is full. Cannot add more songs.");
            return;
        }
        System.out.print("Title: ");
        String title = sc.nextLine().trim();
        System.out.print("Artist: ");
        String artist = sc.nextLine().trim();

        int duration;

        while (true) {
            duration = readInt("Duration (seconds): ");
            if (duration > 0) break;
            System.out.println("Please enter a positive duration.");

        }
        System.out.print("Genre: ");
        String genre = sc.nextLine().trim();
        // FIX: Cast duration to double to match Song constructor
        songs[count++] = new Song(title, artist, (double) duration, genre);
        System.out.println("Song added!");
    }

    private static void listSongs() {
        if (count == 0) {
            System.out.println("No songs in playlist yet.");
            return;
        }
        System.out.printf("%-20s %-20s %6s %-10s%n", "Title", "Artist", "Dur(s)", "Genre");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            songs[i].printSong();
        }
    }
    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = sc.nextLine();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }
}


