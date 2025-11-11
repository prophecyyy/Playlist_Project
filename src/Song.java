import java.util.ArrayList;
import java.util.Scanner;

public class Song {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMENU");
            System.out.println("1. Add Song");
            System.out.println("2. List Songs");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine(); // clear newline

            if (choice == 1) {
                System.out.print("Enter song title to add: ");
                String title = input.nextLine();
                songs.add(title);
                System.out.println("Song added!");
            }
            else if (choice == 2) {
                System.out.println("Songs:");
                for (String s : songs) {
                    System.out.println("- " + s);
                }
            }
            else if (choice == 3) {
                System.out.println("Goodbye!");
                running = false; // end loop
            }
            else {
                System.out.println("Invalid option — try again");
            }
        }
    }
}


