import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] manta = new char[n][5];
        
        for (int i = 0; i < n; i++) {
            String j = input.next();
            char[] stringArr = j.toCharArray();
            
            for (int k = 0; k < 5; k++) {
                if (stringArr[k] == 'Y') {
                    stringArr[k] = '1';
                } else {
                    stringArr[k] = '0';
                }
                
                manta[i][k] = stringArr[k];
            }
        }
        
        String maxAttendingDay = "";
        int maxAttendingSum = 0;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                sum += (int)manta[k][i];
            }
            
            if (sum > maxAttendingSum) {
                maxAttendingDay = "" + (i + 1);
                maxAttendingSum = sum;
            } else if (sum == maxAttendingSum) {
                maxAttendingDay = maxAttendingDay + "," + (i + 1);
            }
        }
        
        System.out.println(maxAttendingDay);
    }
}
