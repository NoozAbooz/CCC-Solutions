import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int score = input.nextInt();
            arr[i] = score;
        } // log input to array
        
        Arrays.sort(arr);
        
        for (int j = 0; j < 2; j++) { // run 2 times to nuke gold and silver
            int maxValue = arr[0];
            for (int i = 0; i < arr.length; i++) { // loop find golds
		        if (arr[i] > maxValue) {
		        	maxValue = arr[i];
		        }
            }
            for (int i = 0; i < arr.length; i++) { // loop purge golds
		        if (arr[i] == maxValue) {
		        	arr[i] = -1;
		        }
            }
        }
        
        int occurrences = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) { // loop find bronze
		    if (arr[i] > maxValue) {
		    	maxValue = arr[i];
		    }
        }
        for (int i = 0; i < arr.length; i++) { // loop purge golds
		    if (arr[i] == maxValue) {
		    	occurrences++;
		    }
        }
        
        System.out.println(maxValue + " " + occurrences);
    }
}
