package bridgelabz;

import java.util.Random;

public class SnakeLadderGame {
	static final int IS_SNAKE = 1;
	static final int IS_LADDER = 2;
	static final int IS_NOPLAY = 3;

	public static int rollDice() {

		Random random = new Random();
		int ran = 1 + random.nextInt(6);
		return ran;
	}

	public static int option() {

		Random random = new Random();

		int opt = 1 + random.nextInt(3);
		return opt;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snack And Ladder Game Programs");
		int countdice = 0;
		int pos = 0;
		int diceValue = 0;
		while (pos <= 100) {

			diceValue = rollDice();
			System.out.println("Dice value is:" + diceValue);
			countdice++;
			int optionResult = option();
			switch (optionResult) {
			case IS_SNAKE:
				pos -= diceValue;
				System.out.println(pos);
				break;
			case IS_LADDER:
				pos += diceValue;
				System.out.println(pos);
				break;
			case IS_NOPLAY:
				pos += 0;
				System.out.println(pos);
				break;
			}
			if (pos < 0) {
				pos = 0;
				System.out.println(pos);
			}
			if (pos == 100) {
				System.out.println("Win !!");
				break;
			}
		}
		if (pos > 100) {
			pos -= diceValue;

			while (pos + diceValue != 100) {
				diceValue = rollDice();
				System.out.println("Dice value is:" + diceValue);
				countdice++;
			}
			pos += diceValue;
			System.out.println(pos + " Win !!");

		}
		System.out.println("Total rounds played :" + countdice);
		System.out.println("End of loop Game");

	}

}
