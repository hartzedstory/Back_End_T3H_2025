
// Collection

import com.sun.source.tree.CaseTree;
import homework_day_10.EmployeeManager;
import homework_day_10.Exception.EmployeeException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        try {
            solution(manager);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }


    }
    private static void solution(EmployeeManager manager) throws EmployeeException {
        System.out.println("----------------------------------");
        System.out.println("1. Them nhan vien");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Tinh tong luong");
        System.out.println("4. Tim nhan vien luong cao nhat");
        System.out.println("5. Tim nhan vien theo ma");
        System.out.println("6. Sap xep theo ten");
        System.out.println("7. Sap xep theo luong");
        System.out.println("8. Thoat");
        System.out.println("----------------------------------");
        System.out.println("Chon chuc nang");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do

        {

            if (choice < 1 || choice > 8) {
                System.out.println("Vui long nhap trong khoan 1 toi 8");
            }
            if (choice == 8) {
                break;
            }
        } while(choice< 1||choice > 8);
        switch(choice)
        {
            case 1:
                manager.addEmployee();
                break;
            case 2:
                manager.showEmployeeList();
                break;
            case 3:
               manager.calculateAllSalary();
                break;
            case 4:
                manager.searchHighestPaid();
                break;
            case 5:
                System.out.println("Nhap ID can tim: ");
                Scanner idScanner = new Scanner(System.in);
                manager.searchById(idScanner.nextLine());
                break;
            case 6:
                manager.sortEmployeeListAlphabetically();
                break;
            case 7:
                manager.sortEmployeeOPaidDescending();
                break;
        }
    }
}