
//Exception - try catch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen");
        Exercise1();
    }

    //Bai 1: Cho phep nguoi dung nhap vao 5 so, neu bat cu so nao loi, bat nhap lai so do
    private static void Exercise1() {
        System.out.println("Nhap vao 5 so nguyen: ");
        int[] numArr = new int[5];
        for (int i = 0; i < 5; i++) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap vao so thu " + i);
                numArr[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Da xay ra loi, vui long nhap lai so thu " + i);
                Scanner sc = new Scanner(System.in);
                numArr[i] = sc.nextInt();
            } finally {
                System.out.println("Ban da nhap xong so thu " + i);
            }
        }
    }
}