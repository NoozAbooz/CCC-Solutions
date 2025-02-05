import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

        String previousInstruction = "";
        String currentInstruction = "";
        while (true) {
            String n = s.nextLine();
            if (Integer.parseInt(n) == 99999) {break;}

            int firstDigit = Integer.parseInt(n.substring(0, 1));
            int secondDigit = Integer.parseInt(n.substring(1, 2));
            //pw.println(Integer.toString(n).substring(0, 1) + Integer.toString(n).substring(1, 2));

            if ((firstDigit + secondDigit) == 0) {
                currentInstruction = previousInstruction;
            } else if ((firstDigit + secondDigit) % 2 == 0) {
                currentInstruction = "right ";
            } else if ((firstDigit + secondDigit) % 2 == 1) {
                currentInstruction = "left ";
            }

            pw.println(currentInstruction + Integer.parseInt(n.substring(2, 5)));
            previousInstruction = currentInstruction;
        }


		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
