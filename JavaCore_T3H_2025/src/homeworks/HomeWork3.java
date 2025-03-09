package homeworks;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arrayNumber = new int[length];
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println(String.format("Nhap phan tu thu %d:",i));
            arrayNumber[i] = sc.nextInt();
        }

        Sum(arrayNumber);
        checkPrimeNumber(arrayNumber);
    }

    private static void Sum(int[] arrayNumber) {
        //Tinh tong cac phan tu chan
        int sumChan = 0;
        int sumLe = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0) {
                sumChan+= arrayNumber[i];
            } else {
                sumLe += arrayNumber[i];
            }
        }
        System.out.println("Tong chan: " + sumChan);
        System.out.println("Tong le: " + sumLe);
    }

    private static void checkPrimeNumber(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length; i++) {
            if (isPrime(arrayNumber[i])) {
                System.out.println(String.format("So %d la so nguyen to", arrayNumber[i]));
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu chia hết cho i, không phải số nguyên tố
            }
        }
        return true;
    }

}
