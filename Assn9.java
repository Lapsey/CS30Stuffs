import java.io.*;
import java.util.*;
import java.lang.*;


class Assn9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String currentFirst = "zzzzzzzzzzzzzzz"; 
        String currentLast = "aaaaaaaaaaaaaaaa";
        int n = 0;

        System.out.print("Enter a word: ");
        String word = kb.nextLine();

        while (!word.equals("quit")) {
            if (word.compareToIgnoreCase(currentFirst) < 0) currentFirst = word;
            if (word.compareToIgnoreCase(currentLast) > 0) currentLast = word;

            System.out.print("Enter a word: ");
            word = kb.nextLine();
            n++;
        }

        System.out.println("First word alphabetically: " + currentFirst);
        System.out.println("Last word alphabetically: " + currentLast);
        System.out.println("Total number of words: " + n);
    }
}