package homeworks.Model;

import java.util.Scanner;

public class Cat extends Animal {
    private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Mew mew");
    }

    public void inputInfor(){
        super.inputInfor();
        System.out.println("Nhap vao giong meo:");
        Scanner sc = new Scanner(System.in);
        this.setBreed(sc.nextLine());
    }

    public void displayInfor(){
        super.displayInfor();
        System.out.println("Giong meo: " + this.getBreed());
    }

}
