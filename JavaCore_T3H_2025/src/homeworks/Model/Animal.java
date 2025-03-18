package homeworks.Model;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age;
    private String species;
    private String color;

    public void makeSound() {}; // Ham truu tuong
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        this.setName(sc.nextLine());

        System.out.println("Nhap tuoi:");
        this.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap giong loai:");
        this.setSpecies(sc.nextLine());

        System.out.println("Nhap mau long:");
        this.setColor(sc.nextLine());
    }

    public void displayInfor() {
        System.out.println("Ten: " + this.getName());
        System.out.println("Tuoi: " + this.getAge());
        System.out.println("Loai: " + this.getSpecies());
        System.out.println("Mau long: " + this.getColor());
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
