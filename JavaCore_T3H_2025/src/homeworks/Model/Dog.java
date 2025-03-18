package homeworks.Model;

import java.util.Scanner;

public class Dog extends Animal {
    private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Woof woof");
    }

    public void inputInfor(){
        super.inputInfor();
        System.out.println("Nhap vao giong cho:");
        Scanner sc = new Scanner(System.in);
        this.setBreed(sc.nextLine());
    }

    public void displayInfor(){
        super.displayInfor();
        System.out.println("Giong cho: " + this.getBreed());
    }

}
