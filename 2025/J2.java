import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(r.readLine());
        Scanner r = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int d = Integer.parseInt(r.nextLine());
		int e = Integer.parseInt(r.nextLine());
		
        for (int i = 0; i < e; i++) {
            char event = r.nextLine().charAt(0);
            int quantity = Integer.parseInt(r.nextLine());

            if (event == 43) {
                d += quantity;
            } else if (event == 45) {
                d -= quantity;
            }
        }

        pw.println(d);

		pw.close();
	}
}
