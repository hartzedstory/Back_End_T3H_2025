package buoi3;

import java.util.Scanner;

/*
-- Vong lap for: for (int i; i < condition; i++)
-- Lap khong biet so lan lap (while)
-- Cho thuc thi lan dau, sau do moi check dieu kien (do while)
-- tu khoa continue: Dung de bo qua vong lap, nhay sang lan lap tiep theo
-- tu khoa break: Dung de stop lai dieu kien lap
 */
public class Main {
    public static void main(String[] args) {
        LectureExercise();
    }

    public static void LectureExercise() {
        Exercise1();
    }
    public static void Exercise1() {
        System.out.println("Nhap so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        do {
            if (n > 0) {
                for (int i = 0; i < n+1; i++) {
                    total = (int) (total + Math.pow(i, 3));
                }
                System.out.println("Ket qua: " + total);
            } else {
                System.out.println("Vui long chi nhap so nguyen duong");
                Exercise1();
            }

        } while (n < 0);
    }

    public static void Exercise2() {
        System.out.println("Nhap day so mong muon");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfDigit = 0;

        for (int i = 0; i <= n; i++) {}
    }

    public static void Lecture() {
        System.out.println("Nhap");
        int n = new Scanner(System.in).nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("HELLO");
        }

        int j = 0;
        while(j < n) {
            System.out.println("Xin chao while");
            j++;
        }


        int k = 0;
        do {
//            if (k % 2 != 0) {
//                continue;
//            }
            System.out.println("Xin chao do-while");
            k++;
        } while (j < n);
    }
}
