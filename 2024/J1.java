import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int red = input.nextInt(); 
        int green = input.nextInt(); 
        int blue = input.nextInt(); 
        
        int cost = red * 3 + green * 4 + blue * 5;
        System.out.println(cost);
    }
}
