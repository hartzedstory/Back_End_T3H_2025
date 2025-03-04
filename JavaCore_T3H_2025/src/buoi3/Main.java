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
        Exercise3();
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
        int reversed = 0;
        int digit = 0;
        while (n != 0) {
            digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        System.out.println(reversed);
    }

    public static void Exercise3() {
        // Tính giai thừa của số n
        System.out.println("Nhap so");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

    public static void Exercise4() {
        int tong = 200000;
        int menhGia1 = 1000;
        int menhGia2 = 2000;
        int menhGia3 = 5000;

        int tongMenhGia1 = tong / menhGia1;
        int tongMenhGia2 = tong / menhGia2;
        int tongMenhGia3 = tong / menhGia3;

        for (int i = 0; i <= tongMenhGia1; i++) {
            int soToMenhGia1 = i;
            for (int j = 0; j <= tongMenhGia2; j++) {
                int soToMenhGia2 = j;
                for (int k = 0; k <= tongMenhGia3; k++) {
                    int soToMenhGia3 = k;

                    int tongTienMenhGia1 = soToMenhGia1 / menhGia1;
                    int tongTienMenhGia2 = soToMenhGia2 / menhGia2;
                    int tongTienMenhGia3 = soToMenhGia3 / menhGia3;

                    if (tong == (tongTienMenhGia1 + tongTienMenhGia2 + tongTienMenhGia3)) {
                        System.out.println(String.format("So to 1000: %d,So to 2000: %d,So to 3000: %d", soToMenhGia1, soToMenhGia2, soToMenhGia3));
                    }
                }
            }
        }
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
