import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
		
        int manta[][] = new int[r][c];

        // populate tiles
        int counter = 1;
        for (int a = 0; a < r; a++){ // interate through rows
            for (int b = 0; b < c; b++) { // columns                
                manta[a][b] = counter;
                counter++;

                if (counter > m) { counter = 1; }
                // pw.print(manta[a][b] + " ");
            }
            // pw.println();
        }

        int minCost = 99999999;
        // check price

        if (r == 2) {
            for (int a = 0; a < c; a++) {
                for (int b = 0; b < c; b++) {
                    if (Math.abs(a-b) > 1) { continue; }

                    int cost = manta[0][a] + manta[1][b];

                    if (cost < minCost) { minCost = cost; }
                }
            }
        }

        if (r == 3) {
            for (int a = 0; a < c; a++) {
                for (int b = 0; b < c; b++) {
                    for (int d = 0; d < c; d++) {
                        if (Math.abs(a-b) > 1 || Math.abs(b-d) > 1) { continue; }
                        int cost = manta[0][a] + manta[1][b] + manta[2][d];
                        if (cost < minCost) { minCost = cost; }
                    }
                }
            }
        }

        if (r == 4) {
            for (int a = 0; a < c; a++) {
                for (int b = 0; b < c; b++) {
                    for (int d = 0; d < c; d++) {
                        for (int e = 0; e < c; e++) {
                            if (Math.abs(a-b) > 1 || Math.abs(b-d) > 1 || Math.abs(d-e) > 1) { continue; }
                            int cost = manta[0][a] + manta[1][b] + manta[2][d] + manta[3][e];
                            if (cost < minCost) { minCost = cost; }
                        }
                    }
                }
            }
        }

        if (r == 5) {
            for (int a = 0; a < c; a++) {
                for (int b = 0; b < c; b++) {
                    for (int d = 0; d < c; d++) {
                        for (int e = 0; e < c; e++) {
                            for (int f = 0; f < c; f++) {
                                if (Math.abs(a-b) > 1 || Math.abs(b-d) > 1 || Math.abs(d-e) > 1 || Math.abs(e-f) > 1) { continue; }
                                int cost = manta[0][a] + manta[1][b] + manta[2][d] + manta[3][e] + manta[4][f];
                                if (cost < minCost) { minCost = cost; }
                            }
                        }
                    }
                }
            }
        }

        if (r == 6) {
            for (int a = 0; a < c; a++) {
                for (int b = 0; b < c; b++) {
                    for (int d = 0; d < c; d++) {
                        for (int e = 0; e < c; e++) {
                            for (int f = 0; f < c; f++) {
                                for (int g = 0; g < c; g++) {
                                    if (Math.abs(a-b) > 1 || Math.abs(b-d) > 1 || Math.abs(d-e) > 1 || Math.abs(e-f) > 1 || Math.abs(f-g) > 1) { continue; }
                                    int cost = manta[0][a] + manta[1][b] + manta[2][d] + manta[3][e] + manta[4][f] + manta[5][g];
                                    if (cost < minCost) { minCost = cost; }
                                }
                            }
                        }
                    }
                }
            }
        }


        pw.println(minCost);

		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
