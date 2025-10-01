package packageName;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Wordle{
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Wordle!\n\nIn this game you will guess a secret 5 letter word. Each turn you will guess a 5 letter word and I will tell you if a letter is correct and in the correct location with a \"*\", if a letter is correct but in the wrong location with a \"!\", and if a letter is incorrect with a \"?\". \r\n");
		while (sc.hasNextLine()) {
			String hiddenword = sc.nextLine();
			String guessed = "";
			while (!(guessed.equals(hiddenword))) {
				String[] letter1 = {"_ ", "_ ", "_ ", "_ ", "_ "};
				System.out.println("Guess the secret word: " + letter1[0] + letter1[1] + letter1[2] + letter1[3] + letter1[4]);
				guessed = scan.nextLine();
				String index = "";
				System.out.println("Your guess: " + guessed);
				for (int i = 0; i < 5; i++) {
					index = guessed.substring(i, i+1);
					if (guessed.substring(i, i+1).equals(hiddenword.substring(i,i+1))) {
						System.out.print("* ");
						letter1[i] = index + " ";
					}
					else if (hiddenword.indexOf(index) >= 0) {
						System.out.print("! ");
						letter1[i] = "_ ";
					}
					else {
						System.out.print("_ ");
						letter1[i] = "_ ";
					}
				}
			}
			System.out.println("Congragulations! You got it! Time to play again...");
		}
	}
}
