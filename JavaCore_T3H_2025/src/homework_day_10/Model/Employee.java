package homework_day_10.Model;

import java.util.Scanner;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;

    public abstract double calculateSalary();

    public void showEmployeeInfo() {
        System.out.println("========Employee information========");
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getId());
        System.out.println("Age: " + this.getAge());
        System.out.println("Salary: " + this.getName());
        System.out.println("====================================");
    }

    public void inputEmployeeInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Input information========");

        System.out.println("Input name:");
        this.setName(scanner.nextLine());

        System.out.println("Input ID:");
        this.setId(scanner.nextLine());

        System.out.println("Input age:");
        this.setAge(scanner.nextInt());

        System.out.println("Input salary:");
        this.setSalary(scanner.nextDouble());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
