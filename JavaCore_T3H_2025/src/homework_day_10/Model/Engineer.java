package homework_day_10.Model;

import java.util.Scanner;

public class Engineer extends Employee {
    private String field;


    //PRAGMA MARK: OVERRIDE FUNCTION
    @Override
    public double calculateSalary() {
        return 2000000 + 3700000;
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("Major: " + this.getField());
    }

    public void inputEmployeeInfo() {
        super.inputEmployeeInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter major:: ");
        this.setField(scanner.nextLine());
    }

    //PRAGMA MARK: GETTER - SETTER

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
