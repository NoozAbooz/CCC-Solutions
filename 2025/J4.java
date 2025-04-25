import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // Scanner r = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(br.readLine());
        int[] manta = new int[n];
		
        // read input into arr
        for (int i = 0; i < n; i++) { 
            if (br.readLine().charAt(0) == 80) { // P = 0, S = 1
                manta[i] = 0;
            } else {
                manta[i] = 1;
            }
        }

        int maxDays = 0;
        for (int i = 0; i < manta.length; i++) {
            int conseq = 1; // manta[k] must be 1 rn so consequtive count starts at 1
            boolean skippedOver = false;
            if (manta[i] == 0) {
                skippedOver = true;
            }

            for (int k = i+1; k < manta.length; k++) { // start at next index down
                if (manta[k] == 0) { // if is percipitation
                    if (skippedOver == false) {
                        conseq++;
                        skippedOver = true;
                    } else if (skippedOver = true) {
                        break;
                    }
                } else { // if is sunny
                    conseq++;
                }
            }

            if (conseq > maxDays) {
                maxDays = conseq;
            }
        }
        pw.println(maxDays);

        // // print arr
        // for (int i : manta) {
        //     pw.println(i);
        // }

		pw.close();
	}
}
