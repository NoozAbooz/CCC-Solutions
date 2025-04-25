import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        // true = sunny, false = precipitation
        boolean[] sunny = new boolean[n];
        for (int i = 0; i < n; i++) {
            char c = br.readLine().charAt(0);
            sunny[i] = (c != 'P');
        }

        int left = 0;
        int precipCount = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            if (!sunny[right]) {
                precipCount++;
            }
            // shrink window until we have at most one precipitation
            while (precipCount > 1) {
                if (!sunny[left]) {
                    precipCount--;
                }
                left++;
            }
            // window [left..right] has at most one precipitation
            maxLen = Math.max(maxLen, right - left + 1);
        }

        pw.println(maxLen);
        pw.close();
    }
}
