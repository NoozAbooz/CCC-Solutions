import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p = input.nextInt();
        int c = input.nextInt();
        
        int points = 0;
        
        points += 50 * p;
        points -= 10 * c;
        
        if (p > c) {
            points += 500;
        }
        
        System.out.println(points);
    }
}
