package buoi2;

import java.util.Scanner;

/*
public: Duoc truy cap o moi file, class khac
private: Chi co the truy cap khi nam chung mot file
protected: Co the truy cap khi nam chung mot package. Neu khac package,
thi phai la class con ke thua class cha
default: Chi co the truy cap khi cung chung mot package

==> Pham vi truy cap
 - Duoc su dung de bao ve du lieu cua mot 1 class, giup du lieu cua cac class
 khong bi truy cap va sua doi trai phep
 - Truoc khi lap tring OOP sinh ra, cac lap trinh vien thuc hien theo huong cau truc

---- CACH KHAI BAO CUA MOT BIEN ----
    - La mot vi tri trong vung nho may tinh, duoc cap phat khi chuong trinh
    bat dau chay. Tac dung de luu tru du lieu cua chuong trinh.
    - Moi bien se co: Ten, kieu du lieu, dia chi o nho
    - Khi khai bao, tuc la dang yeu cau may ao JVM cap phat mot vung nho
    nhat dinh de luu tru du lieu cua chuong trinh

    - Cac kieu thuc du lieu:
        + Kieu du lieu nguyen thuy (byte, short, int, long, float, double, bool, char)
        + Kieu du lieu doi tuong (Interge, String, Double, Float, Long, Boolean)
        Day la cac class, model class
        ==> 2 kieu du lieu nay khac nhau nhu sau:
            + Noi duoc tao ra khi khai bao
                ++ Kieu nguyen thuy: Nam trong stack
                ++ Kieu doi tuong:
                    ++ Bien duoc khai bao nam trong stack
                    ++ Gia tri cua bien nam trong heap
            + Cac mien gia tri co the chua duoc
    - Trong lap trinh huong cau truc, co 2 loai bien:
        + Bien tham tri:
            ++ Khi truyen 1 tham so vao trong mot ham, ngoai truyen gia tri
            cua bien con truyen vao  ca dia chi o nho
            ==> Neu trong method thay doi gia tri truyen va, vay khi chuong trinh chay xong medthod
            bien do cung se thay doi gia tri
        + Bien tham chieu:
            ++ Khi truyen vao 1 gia tri vao trong mot ham, chi truyen vao gia tri, khong
            truyen dia chi vao method
            ==> Khi methid thay doi gia tri thi bien ban dau khong bi anh huong
    - Cac kieu bien torng Java
        + local: cac bien duoc khai bao trong method, chi duoc su dung trong method do
        + instance: cac bien toan cuc duoc khai bao trong class
        + static: cac bien duoc khoi tao ma khong can tao class truoc do

   TU KHOA STATIC:
    +   BIEN STATIC
    +   METHOD STATIC
    +   KHOI STATIC
    ==> Tat ca deu thuoc quan ly cua class, se duoc khoi tao ngay khi chuong trinh khoi tao
        - Voi method static:
            + Chi cho phep goi toi method static, cung class. Con cac method non static chi duoc khoi thong qua doi tuong
        - Voi bien static:
            + Co the su dung bien static tu ben ngoai
 */
public class Person {
    private String name;
    protected int age;
    String email;
    public static void main(String[] args) {
//        baiTap1();
        baiTap2();
    }


    public void setname(String name) {
        this.name = name;
    }
    public static void baiTap1() {
        System.out.println("Nhập họ và tên:");
        String name = new Scanner(System.in).next();
        System.out.println("Nhập ngày tháng năm sinh:");
        String dob = new Scanner(System.in).next();
        System.out.println("Nhập quê quán:");
        String origin = new Scanner(System.in).next();
        System.out.println("Nhập đơn vị công tác:");
        String organization = new Scanner(System.in).next();

        System.out.print("Xin chào " + name + " đến từ " + origin + ", sinh ngày " + dob +
                " hiện đang công tác tại " + organization);
    }


    public static void baiTap2() {
        System.out.println("Nhập số đầu tiên:");
        int firstNum = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tiếp theo:");
        int secondNum = new Scanner(System.in).nextInt();
        System.out.println("Tổng: " + sum(firstNum, secondNum));
        System.out.println("Tích: " + prod(firstNum, secondNum));
        System.out.println("Thương: " + quotient(firstNum, secondNum));
        System.out.println("Dư: " + reminder(firstNum, secondNum));
    }

    private static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    private static int prod(int a, int b) {
        int result = a * b;
        return result;
    }
    private static int quotient(int a, int b) {
        int result = a / b;
        return result;
    }
    private static int reminder(int a, int b) {
        int result = a % b;
        return result;
    }


    public static void baiTap3() {
        System.out.println("Nhập chiều dài:");
        int firstNum = new Scanner(System.in).nextInt();
        System.out.println("Nhập chiều rộng:");
        int secondNum = new Scanner(System.in).nextInt();
        int square = firstNum * secondNum;
        System.out.println("Diện tích:" + square);
    }
}
