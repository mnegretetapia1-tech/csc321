// Moises Negrete
/*
 *
 *lab 4 
*/




 	import java.util.Scanner;

public class mnegrete4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Joke Menu ===");
        System.out.println("1) School joke");
        System.out.println("2) Computer joke");
        System.out.println("3) Food joke");
        System.out.println("4) Random joke");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = input.nextInt();  // user input

        switch (choice) {
            case 1:
                System.out.println("Why did the student eat their homework? Because the teacher said it was a piece of cake!");
                break;
            case 2:
                System.out.println("Why do programmers prefer dark mode? Because light attracts bugs.");
                break;
            case 3:
                System.out.println("Why did the tomato turn red? Because it saw the salad dressing!");
                break;
            case 4:
                System.out.println("What do you call fake spaghetti? An impasta!");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
        }

        input.close();
    }
}

