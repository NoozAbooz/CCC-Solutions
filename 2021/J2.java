// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());

        String highestBidName = "";
        int highestBid = 0;

        for (int i = 0; i < n; i++) {
            String name = r.readLine();
            int bid = Integer.parseInt(r.readLine());

            if (bid > highestBid) {
                highestBid = bid;
                highestBidName = name;
            }
        }
		
        pw.println(highestBidName);

		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
