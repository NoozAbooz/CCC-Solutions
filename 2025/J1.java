import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(r.readLine());
        Scanner r = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(r.nextLine());
		int c = Integer.parseInt(r.nextLine());
		int p = Integer.parseInt(r.nextLine());

        int pplNextRide = c * p;

        if (n <= pplNextRide) {
            pw.println("yes");
        } else {
            pw.println("no");
        }

		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
