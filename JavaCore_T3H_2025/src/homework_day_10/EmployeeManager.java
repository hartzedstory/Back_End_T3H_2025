package homework_day_10;

import homework_day_10.Exception.EmployeeException;
import homework_day_10.IEmployeeManager.IEmployeeManager;
import homework_day_10.Model.Employee;
import homework_day_10.Model.Engineer;
import homework_day_10.Model.Manager;
import homework_day_10.Model.Officer;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager implements IEmployeeManager {
    ArrayList<Employee> employeeList = new ArrayList<>();
    private double totalSalary = 0;
    private Employee highestPaid;

    @Override
    public void addEmployee() throws EmployeeException {
        System.out.println("Chon type nhan vien: \n1: Nhan vien van phong\n2: Ky su\n3: Quan ly");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                Employee nhanVienVanPhong = new Officer();
                nhanVienVanPhong.inputEmployeeInfo();
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(nhanVienVanPhong.getId())) {
                        throw new EmployeeException("ID already exist");
                    } else {
                        employeeList.add(nhanVienVanPhong);
                    }
                }
            case "2":
                Employee kySu = new Engineer();
                kySu.inputEmployeeInfo();
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(kySu.getId())) {
                        throw new EmployeeException("ID already exist");
                    } else {
                        employeeList.add(kySu);
                    }
                }
            case "3":
                Employee quanLy = new Manager();
                quanLy.inputEmployeeInfo();
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(quanLy.getId())) {
                        throw new EmployeeException("ID already exist");
                    } else {
                        employeeList.add(quanLy);
                    }
                }
        }
    }

    @Override
    public void showEmployeeList() {
        employeeList.forEach(employee -> {
            employee.showEmployeeInfo();
        });
    }

    @Override
    public void calculateAllSalary() {
        employeeList.forEach(employee -> {
            totalSalary += employee.calculateSalary();
        });
    }

    @Override
    public void searchHighestPaid() {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getSalary() > highestPaid.getSalary()) {
                highestPaid = employeeList.get(i);
            }
        }

        System.out.println("Highest Paid Salary: ");
        highestPaid.showEmployeeInfo();
    }

    @Override
    public void searchById(String id) {
        employeeList.forEach(employee -> {
            if (employee.getId().equals(id)) {
                System.out.println("Employee by search: ");
                employee.showEmployeeInfo();
            }
        });
    }

    @Override
    public void sortEmployeeListAlphabetically() {
        for (int i = 0; i < employeeList.size(); i++) {
            while (i+1 < employeeList.size()) {
                sortEmployee(employeeList.get(i), employeeList.get(i+1));
            }
        }
    }

    @Override
    public void sortEmployeeOPaidDescending() {

    }

    private void sortEmployee(Employee e1, Employee e2) {

    }
}
