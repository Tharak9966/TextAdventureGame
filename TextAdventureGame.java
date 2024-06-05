import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious castle. Your goal is to find the hidden treasure.");
        System.out.println("You are in the castle's entrance hall. There are three doors: left, right, and center.");

        while (true) {
            System.out.print("Choose a door (left/right/center): ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "left":
                    System.out.println("You enter the left room. It's dark and damp.");
                    System.out.println("You see a rusty key on the floor.");
                    System.out.print("Do you want to take the key? (yes/no): ");
                    String takeKey = scanner.nextLine().toLowerCase();
                    if (takeKey.equals("yes")) {
                        System.out.println("You take the key and put it in your pocket.");
                    } else {
                        System.out.println("You leave the key behind.");
                    }
                    break;
                case "right":
                    System.out.println("You enter the right room. It's filled with cobwebs.");
                    System.out.println("You see a giant spider blocking your way.");
                    System.out.print("Do you want to fight the spider? (yes/no): ");
                    String fightSpider = scanner.nextLine().toLowerCase();
                    if (fightSpider.equals("yes")) {
                        System.out.println("You bravely fight the spider and defeat it!");
                    } else {
                        System.out.println("You run away from the spider.");
                    }
                    break;
                case "center":
                    System.out.println("You enter the center room. It's a library.");
                    System.out.println("You find a dusty book on a shelf.");
                    System.out.print("Do you want to read the book? (yes/no): ");
                    String readBook = scanner.nextLine().toLowerCase();
                    if (readBook.equals("yes")) {
                        System.out.println("The book contains a riddle: 'What has keys but can't open locks?'");
                    } else {
                        System.out.println("You ignore the book.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.print("Do you want to explore another room? (yes/no): ");
            String exploreAgain = scanner.nextLine().toLowerCase();
            if (exploreAgain.equals("no")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }

        scanner.close();
    }
}
