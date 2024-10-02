import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        
        while (true) {
            int yobi = input.nextInt();
            if (yobi < d) {
                d += yobi;
            } else {
                System.out.println(d);
                break;
            }
        }
    }
}
