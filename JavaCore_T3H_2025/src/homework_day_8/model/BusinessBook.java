package homework_day_8.model;

import java.util.Scanner;

public class BusinessBook extends Book {
    private String businessField;

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap linh vuc kinh doanh: ");
        this.setBusinessField(input.nextLine());
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Linh vuc kinh doanh: " + this.getBusinessField());
    }
}
