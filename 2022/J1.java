import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r = input.nextInt();
        int s = input.nextInt();
        
        System.out.println((r * 8 + s * 3) - 28);
    }
}
