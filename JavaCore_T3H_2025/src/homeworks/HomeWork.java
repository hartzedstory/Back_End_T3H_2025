package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        exercise5();
    }

    private static void exercise1() {
        // Tinh diem chuyen can
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can:");
        int hardworkScore = scanner.nextInt();
        System.out.println("Nhap diem giua ky:");
        int midtermScore = scanner.nextInt();
        System.out.println("Nhap diem cuoi ky:");
        int finalScore = scanner.nextInt();

        int result = (hardworkScore + midtermScore + finalScore) / 3;
        String grade = "";
        if (result >= 9) {
            grade = "A";
        } else if (7 <= result && result < 9) {
            grade = "B";
        } else if (5 <= result && result < 7) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Hoc luc cua sinh vien: " + grade);
    }

    private static void exercise2() {
        enum TriangleType {
            SCALENE_TRIANGLE, RIGHT_TRIANGLE, ISOSCALENE_TRIANGLE, RIGHT_ANGLED_TRIANGLE, EQUILATERN_TRIANGLE, NONE
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh A:");
        int a = scanner.nextInt();
        System.out.println("Nhap canh B:");
        int b = scanner.nextInt();
        System.out.println("Nhap canh C:");
        int c = scanner.nextInt();
        TriangleType type = TriangleType.NONE;

        // Get longest side of a triangle, sorting from smallest to largest
        int[] side = {a, b, c};
        Arrays.sort(side);

        //Validate if it's a triangle
        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                type = TriangleType.EQUILATERN_TRIANGLE;
            } else if (a == b || b == c || a == c) {
                type = TriangleType.ISOSCALENE_TRIANGLE;
            } else if (side[0] * side[0] + side[1] * side[1] == side[2] * side[2]) {
                type = TriangleType.RIGHT_TRIANGLE;
            } else if (side[0] == side[1] && side[0] * side[0] + side[0] * side[0] == side[2] * side[2]) {
                type = TriangleType.RIGHT_ANGLED_TRIANGLE;
            }
        } else {
            type = TriangleType.NONE;
        }
        System.out.println("Triangle type is: " + type);
    }
    private static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static void exercise3() {
        // Tinh dien theo bac
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter electric usage in month:");
        int electricUsage = scanner.nextInt();
        int electricUsageBill = 0;

        if (0 <= electricUsage && electricUsage <= 50) {
            electricUsageBill = electricUsage * 1678;
        } else if (51 <= electricUsage && electricUsage <= 100) {
            electricUsageBill = 50 * 1678 + (electricUsage - 50) * 1734;
        } else if (101 <= electricUsage && electricUsage <= 200) {
            electricUsageBill = 50 * 1678 + 50 * 1734 + (electricUsage - 150) * 2014;
        } else if (201 <= electricUsage && electricUsage <= 300) {
            electricUsageBill = 50 * 1678 + 50 * 1734 + 100 * 2014 + (electricUsage - 250) * 2536;
        } else if (300 <= electricUsage && electricUsage <= 400) {
            electricUsageBill = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (electricUsage - 350) * 2834;
        } else {
            electricUsageBill = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (electricUsage - 400) * 2927;
        }
        System.out.println("ElectricUsageBill is: " + electricUsageBill);
    }

    private static void exercise4() {
        System.out.println("----------------------------------");
        System.out.println("1. Tinh diem sinh vien");
        System.out.println("2. Kiem tra loai tam giac");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Tinh so ngay trong thang cua nam");
        System.out.println("5. Ket thuc");
        System.out.println("----------------------------------");
        System.out.println("Chon chuc nang");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do {

            if (choice < 1 || choice > 4) {
                System.out.println("Vui long nhap trong khoan 1 toi 5");
            }
            if (choice == 5) {
                break;
            }
        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                exercise1();
                break;
                case 2:
                    exercise2();
                    break;
                    case 3:
                        exercise3();
                        break;
                        case 4:
                            exercise5();
                            break;
                            case 5:
                                break;
        }
    }

    private static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap nam:");
        int year = scanner.nextInt();
        System.out.println("Vui long nhap thang:");
        int month = scanner.nextInt();
        do {
            if (month < 1 || month > 12) {
                System.out.println("Vui long nhap thang hop le. Nhap lai");
            } else {
                int numberOfDaysInMonthOfYear = getDaysInMonth(year, month);
                System.out.println("Thang " + month + " cua nam " + year + " co " + numberOfDaysInMonthOfYear + " ngay");
            }
        } while (month < 1 || month > 12);
        scanner.close();
    }

    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29; // Nam nhuan
                } else {
                    return 28; // Nam thuong
                }
            default:
                return 0;
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
