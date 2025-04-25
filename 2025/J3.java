import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner r = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(r.nextLine());
		
        for (int i = 0; i < n; i++) {
            String oldCode = r.nextLine();
            char[] oldCodeArr = oldCode.toCharArray();

            // sum numbers
            int sum = 0;
            for (int k = 0; k < oldCodeArr.length; k++) {
                if ((oldCodeArr[k] >= 48 && oldCodeArr[k] <= 57)) { // handle regular numbers as tokens
                    String token = "" + oldCodeArr[k];
                    if (k > 0 && oldCodeArr[k - 1] == 45) {
                        token = "-" + token;
                    }

                    for (int l = k + 1; l < oldCodeArr.length; l++) {
                        if (!(oldCodeArr[l] >= 48 && oldCodeArr[l] <= 57)) {
                            k = l;
                            break; 
                        }
                        token += oldCodeArr[l];
                    }

                    int tokenValue = 0;

                    // add up the token digit into integer value by multiplying each place by tens raised to power of position
                    for (int a = 0; a < token.length(); a++) {
                        int tokenDigit = token.charAt(token.length() - (a+1)) - 48;
                        if (tokenDigit == -3) { continue; } // exception if minus sign detected
                        tokenValue += tokenDigit * (int)Math.pow(10, a);
                    }

                    if (token.charAt(0) == 45) {
                        sum -= tokenValue;
                    } else {
                        sum += tokenValue;
                    }
                }

            }

            // print arr
            for (char a : oldCodeArr) { 
                if (a >= 65 && a <= 90) { pw.print(a); } // strip lowercase
            }
            // append sum
            pw.print(sum);

            pw.println();
        }

		pw.close();
	}
}
