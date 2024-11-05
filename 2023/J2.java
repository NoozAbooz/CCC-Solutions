import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            String j = input.next();
            
            if (j.equals("Poblano")) {
                score += 1500;
            } else if (j.equals("Mirasol")) {
                score += 6000;
            } else if (j.equals("Serrano")) {
                score += 15500;
            } else if (j.equals("Cayenne")) {
                score += 40000;
            } else if (j.equals("Thai")) {
                score += 75000;
            } else if (j.equals("Habanero")) {
                score += 125000;
            }
        }
        
        System.out.println(score);
    }
}
