
// Module 4 Excercise 4.13
// By. Addison Roy

// Imports 
import java.util.Scanner;

public class VorC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Vowel or Constant finder!");
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else if ((letter >= 'a' && letter <= 'z')) {
            System.out.println(letter + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet letter.");
        }

        scanner.close();
    }
}
