package homework_day_10.Model;

import java.util.Scanner;

public class Officer extends Employee {
    private int workedDay;

    //PRAGMA MARK: OVERRIDE FUNCTION
    @Override
    public double calculateSalary() {
        return 5000000 + (this.getWorkedDay() * 100000);
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("Worked day: " + this.getWorkedDay());
    }

    public void inputEmployeeInfo() {
        super.inputEmployeeInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter worked day: ");
        this.setWorkedDay(scanner.nextInt());
    }

    // PRAGMA MARK: GETTER - SETTER
    public int getWorkedDay() {
        return workedDay;
    }

    public void setWorkedDay(int workedDay) {
        this.workedDay = workedDay;
    }

}
