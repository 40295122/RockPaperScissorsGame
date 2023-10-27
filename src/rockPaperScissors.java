import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		String[] rps = { "r", "p", "s" };
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String computerMove = rps[new Random().nextInt(rps.length)];

			System.out.println("Please enter your move (r, p or s)");
			String playerMove = scanner.nextLine();

			while (true) {
				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
					break;
				else
					System.out.println("Please enter an available move (r, p or s)");
					playerMove = scanner.nextLine();
			}

			System.out.println("Computer chose: " + rockPaperOrScissor(computerMove));
			System.out.println("You chose: " + rockPaperOrScissor(playerMove));

			if (computerMove.equals(playerMove)) {
				System.out.println("You tied!");
			} else if (computerMove.equals("r")) {
				if (playerMove.equals("s"))
					System.out.println("You lose!");
				else if (playerMove.equals("p"))
					System.out.println("You win!");
			} else if (computerMove.equals("p")) {
				if (playerMove.equals("s"))
					System.out.println("You win!");
				else if (playerMove.equals("r"))
					System.out.println("You lose!");
			} else if (computerMove.equals("s")) {
				if (playerMove.equals("r"))
					System.out.println("You win!");
				else if (playerMove.equals("p"))
					System.out.println("You lose!");
			}

			System.out.println("Would you like to play again? (y/n): ");
			String input = scanner.nextLine();

			if (!input.equals("y")) {
				System.out.println("Bye! Thanks for playing!");
				break;
			}

		}
		scanner.close();

	}

	public static String rockPaperOrScissor(String rps) {
		String word = "";

		if (rps.equals("r")) {
			word = "rock";
		} else if (rps.equals("p")) {
			word = "paper";
		} else {
			word = "scissors";
		}

		return word;

	}

}
