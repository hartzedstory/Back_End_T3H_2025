package homeworks.Model;

import java.util.Scanner;

public class Bird extends Animal {
    private String wingSpan;

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void makeSound() {
        System.out.println("Tweet Tweet");
    }

    public void inputInfor(){
        super.inputInfor();
        System.out.println("Nhap do sai canh:");
        Scanner sc = new Scanner(System.in);
        this.setWingSpan(sc.nextLine());
    }

    public void displayInfor(){
        super.displayInfor();
        System.out.println("Sai canh: " + this.getWingSpan());
    }

    public void fly() {
        System.out.println("Flying");
    }

}
