import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int playerCount = input.nextInt();
		int highRatingPlayers = 0;
		boolean goldTeam = true;
		
		for (int i = 0; i < playerCount; i++) {
			int starsGained = 5 * input.nextInt();
			int starsLost = 3 * input.nextInt();
			
			if (starsGained - starsLost > 40) {
				highRatingPlayers++;
			} else {
				goldTeam = false;
			}
		}
		
		String num = Integer.toString(highRatingPlayers);
		if (goldTeam == true) {
			System.out.println(num + '+');
		} else {
			System.out.println(highRatingPlayers);
		}
	}

}
