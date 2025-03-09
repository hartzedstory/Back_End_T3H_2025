package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Vui long nhap so dien thoai: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if (validatePhoneNumber(n)) {
            System.out.println("So dien thoai hop le");
        } else {
            System.out.println("So dien thoai khong hop le");
        }
    }

    private static boolean validatePhoneNumber(String phoneNumber) {
        // Define regex patterns for allowed phone number formats
        String regex = "^(\\+84|84|0)(\\d{9})$|^(0\\d{3}[\\.\\-]?\\d{3}[\\.\\-]?\\d{3})$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Match the input string against the pattern
        Matcher matcher = pattern.matcher(phoneNumber);

        // Return true if it matches any of the allowed formats
        return matcher.matches();
    }
}
