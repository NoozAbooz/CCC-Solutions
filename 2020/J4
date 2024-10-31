import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String sentence = input.nextLine();
        String word = input.nextLine();
        
        boolean found = false;
		for (int x = 0; x < word.length(); x++) {
			word = word.substring(1) + word.charAt(0);
	
			if (sentence.contains(word)) {
				found = true;
			}
		}
		
		if (found == true) {
		    System.out.println("yes");
		} else {
		    System.out.println("no");
		}
    }
}
