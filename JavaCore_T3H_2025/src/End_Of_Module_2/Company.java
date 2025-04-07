package End_Of_Module_2;

import End_Of_Module_2.Entity.Employee;

import java.util.*;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    HashMap<String, Double> salaryMaping = new HashMap<>();
    HashSet<String> companyDepartments = new HashSet<>();

    public void initDefaultEmployees() {
        Employee emp1 = new Employee("Nguyen van A", 18, 2000000.0);
        Employee emp2 = new Employee("Nguyen van B", 18, 10000000.0);
        Employee emp3 = new Employee("Nguyen van C", 18, 5000000.0);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Them nhan vien thanh cong");
    }

    public void showAllEmployees() {
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

    public void modifySalary(Employee employee, Double newSalary) {
        //Fetch all list employee first
        for (Employee emp : employees) {
            salaryMaping.put(emp.getName(), emp.getSalary());
        }

        //Put du lieu moi vao, Check xem nhan vien co ton tai hay khong
        if (salaryMaping.containsKey(employee.getName())) {
            try {
                employee.updataSalary(employee, newSalary);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            salaryMaping.put(employee.getName(), employee.getSalary());
        }
    }

    public void searchEmployee(Employee employee) {
        if (salaryMaping.containsKey(employee.getName())) {
            employee.displayInfo();
        }
    }

    public void addDepartment(String department) {
        if (companyDepartments.contains(department)) {
            System.out.println("Phong ban da ton tai");
        } else {
            companyDepartments.add(department);
        }
    }

    public void showAllDepartments() {
        for (String department : companyDepartments) {
            System.out.println(department);
        }
    }

    public void sortBySalary() {
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("List sau khi sort");
        System.out.println(employees.toString());
    }


}
