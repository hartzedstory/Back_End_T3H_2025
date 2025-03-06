package buoi4;

import java.util.Scanner;

/*
MẢNG - ARRAY
        int[] array = new int[10]; //Mang co the chua 10 phan tu
        String[] arrString = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        //Array cho phep truy cap thong qua index
        System.out.println(arrString[0]);

        // duyet cac phan tu cua danh sach
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
 */
public class Main {
    public static void main(String[] args) {
//        OnClassEx1();
        StringLecture();
    }

    public static void OnClassEx1() {
        System.out.println("Nhap vao so luong phan tu mong muon");
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        int[] inputArray = new int[input];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(String.format("Vui long nhap phan tu thu: %d", i));
            int temp = sc.nextInt();
            inputArray[i] = temp;
        }
        // Tinh tong cac so trong mang
        int result = 0;
        for (int i = 0; i < inputArray.length; i++) {
            result += inputArray[i];
        }
        System.out.println("Tong: " + result);

        int max = inputArray[0];
        int min = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void StringLecture() {
        String stringNguyenThuy = "Hello";
        String stringDoiTuong = new String("Hello Model");
        System.out.println("String lenght: " + stringNguyenThuy.length());
        System.out.println("Substring: " + stringNguyenThuy.substring(1,4));
        System.out.println("Ep kieu so thanh chuoi: " + stringNguyenThuy.valueOf(3));
        stringNguyenThuy.split("");
        System.out.println("Cat chuoi: " );
    }
}
