package demoModule1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    P3Ex2();
    }
    private static void P1Ex1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so dau tien: ");
        int first = sc.nextInt();
        System.out.println("Vui long nhap so thu hai: ");
        int second = sc.nextInt();
        System.out.println("Tong 2 so la: " +  (first+second));
    }

    private static void P1Ex2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ban kinh hinh trong: ");
        int num = sc.nextInt();
        Double result = num * num * Math.PI;
        System.out.println("Dien tich hinh trong: " + result);
        if (result%2==0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }
    }
    private static void P2Ex1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }
    }
    private static void P2Ex2(){
        System.out.println("Vui long so dai dien cho ngay: (1-7)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Chu nhat");
            case 2:
                System.out.println("Thu 2");
            case 3:
                System.out.println("Thu 3");
            case 4:
                System.out.println("Thu 4");
            case 5:
                System.out.println("Thu 5");
            case 6:
                System.out.println("Thu 6");
            case 7:
                System.out.println("Thu 7");
        }
    }

    private static void P2Ex3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số chuyến đi: ");
        int soChuyenDi = sc.nextInt();
        int giaChuyen = 10000;
        double tienPhaiTra = soChuyenDi * giaChuyen;

        if (soChuyenDi > 10) {
            tienPhaiTra *= 0.8;
        } else if (soChuyenDi > 5) {
            tienPhaiTra *= 0.9;
        }
        System.out.println("Số tiền phải trả là: " + tienPhaiTra + " VNĐ");
    }

    private static void P3Ex1(){
        System.out.println("Nhap vao chuoi");
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();

        StringBuilder sb =  new StringBuilder(chuoi);
        sb.reverse();

        System.out.println("Chuoi sau khi dao nguoc: " + sb.toString());
    }

    private static void P3Ex2() {
        System.out.println("Nhap vao chuoi de kiem tra chuoi doi xung hay khong: ");
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();
        StringBuilder chuoiArray =  new StringBuilder(chuoi);
        boolean isValid = false;
        boolean isEvenNumber = false;
        //Check xem so luong tu nhap vao co phai chan hay khong
        if (chuoiArray.length() % 2 == 0) {
            isEvenNumber = true;
        }

        if (isEvenNumber) {
            //revert lai chuoi va so sanh voi chuoi goc
            String chuoiReverse = chuoiArray.reverse().toString();
            if (chuoi.equalsIgnoreCase(chuoiReverse)) {
                isValid = true;
            }
        } else {
            StringBuilder chuoiA = new StringBuilder(chuoiArray.toString().toLowerCase());

            for (int i = 0; i < chuoiArray.length() / 2; i++) {
                if (chuoiA.charAt(i) != chuoiA.charAt(chuoiArray.length() - i - 1)) {
                    isValid = false;
                    break;  // Nếu không đối xứng thì thoát khỏi vòng lặp
                }
            }
        }

        if (isValid) {
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Chuoi bat doi xung");
        }
    }

    private static void P3Ex3() {
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

        // Them 1 phan tu vao trong mang theo index mong muon
        System.out.println("Nhap index can them gia tri");
        int index = sc.nextInt();
        System.out.println("Nhap index can them gia tri");
        int needAddValue = sc.nextInt();
        AddElementAt(inputArray,needAddValue,index);

        // Nhap vao 1 phan tu va xoa cac phan tu do trong mang

        System.out.println("Nhap so can Xoa");
        int needDeletedValue = sc.nextInt();
        DeleteElementWith(needDeletedValue,inputArray);

        //Tim phan tu lon thu 3 trong mang
        SoLont3(inputArray);
    }

    private static void SoLont3(int[] mangSoNguyen) {
        for (int i = 0; i < mangSoNguyen.length; i++) {
            for (int j = i; j < mangSoNguyen.length; j++) {
                if (mangSoNguyen[i] < mangSoNguyen[j]) {
                    int term = mangSoNguyen[i];
                    mangSoNguyen[i] = mangSoNguyen[j];
                    mangSoNguyen[j] = term;
                }
            }
        }
        System.out.println("Phan tu lon thu 3: " +  mangSoNguyen[2]);
    }

    private static void AddElementAt(
                                     int[] mangSoNguyen,
                                     int numberNeedToAdd,
                                     int index) {
        int soLuongPhanTuBanDau = mangSoNguyen.length;
        if (soLuongPhanTuBanDau == mangSoNguyen.length) {
            System.out.println("Can not add!!!");
            return;
        }
        // Them 100% o nho cua mang ban dau
        soLuongPhanTuBanDau += soLuongPhanTuBanDau;

        //Duyet vi tri can them
        for (int i = 0; i < soLuongPhanTuBanDau; i++) {
            if (i != index){
                continue;
            }
            for (int j = soLuongPhanTuBanDau - 1; j > i; j--) {
                mangSoNguyen[j] = mangSoNguyen[j - 1];
            }
            mangSoNguyen[index] = numberNeedToAdd;
            break;
        }

        //In ra mang sai cuoi cung
        System.out.println("Mang sau khi them: " +  mangSoNguyen);
    }

    private static void DeleteElementWith(int soCanXoa, int[] mangSoNguyen) {
        int deletedNum = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            int temp = mangSoNguyen[i];

            if (soCanXoa == temp) {
                // nếu tìm thấy => duyệt từ index i cho đến cuối mảng
                for (int j = i; j < mangSoNguyen.length; j++) {
                    if (j == mangSoNguyen.length - 1){
                        continue;
                    }
                    mangSoNguyen[j] = mangSoNguyen[j + 1];
                }
                // lùi lại cả index i phục vụ cho trường hợp 2 số cần xóa cạnh nhau
                i--;
                // lưu lại số lượng số đã xóa
                deletedNum++;
            }
        }

        System.out.println("Mang sau khi xoa: " +  mangSoNguyen);
    }
}
