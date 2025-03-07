package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        StringHandler();

    }

    private static void StringHandler() {
        System.out.println("Nhap vao van ban: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        WordCounter(input);
    }
    private static void WordCounter(String input) {
        int wordCount = 0;
        String[] words = input.trim().split("\\s+");
        wordCount = words.length;
        System.out.println("Van ban tren co " + wordCount +" ky tu");
    }
}
