package homework_day_10.Model;

import java.util.Scanner;

public class Manager extends Employee {
    private int multiplier;

    //PRAGMA MARK: OVERRIDE FUNCTION
    @Override
    public double calculateSalary() {
        return 3700000 * this.getMultiplier();
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("Multiplier: " + this.getMultiplier());
    }

    public void inputEmployeeInfo() {
        super.inputEmployeeInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiplier: ");
        this.setMultiplier(scanner.nextInt());
    }

    //PRAGMA MARK: GETTER - SETTER

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
