package bridgelabz;

import java.util.Random;

public class SnakeLadderGame {
	
	public static int rollDice() {
		Random random=new Random();
    	int ran=1+random.nextInt(6);
    	return ran;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snack And Ladder Game Programs");
		int playerPosition=0;
		rollDice();
	}

}
