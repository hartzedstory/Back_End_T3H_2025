import homeworks.Model.Bird;
import homeworks.Model.Cat;
import homeworks.Model.Dog;
import homeworks.Model.Zoo;

import java.util.Scanner;

public class Main {
    static Zoo zoo = new Zoo(); // Khoi tao zoo
    public static void main(String[] args) {
        mainFunc(zoo);
    }

    private static void mainFunc(Zoo zoo) {
        System.out.println("Vui long chon chuc nang ung dung:");
        System.out.println("1 - Them doi tuong cho:");
        System.out.println("2 - Them doi tuong meo:");
        System.out.println("3 - Them doi tuong chim:");
        System.out.println("4 - Phat am thanh cua tat ca");
        System.out.println("5 - Hien thi thong tin tat ca");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        do {
            if (choice < 1 || choice > 4) {
                System.out.println("Vui long nhap trong khoan 1 toi 5");
            }
            if (choice == 5) {
                break;
            }
        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                themCho(zoo);
            case 2:
                themMeo(zoo);
            case 3:
                themChim(zoo);
            case 4:
                makeAllSound(zoo);
            case 5:
                displayAllInfo(zoo);
        }
    }

    private static void themCho(Zoo zoo) {
        Dog dog = new Dog();
        dog.inputInfor();

        zoo.addAnimal(dog);
        mainFunc(zoo);
    }
    private static void themMeo(Zoo zoo) {
        Cat cat = new Cat();
        cat.inputInfor();

        zoo.addAnimal(cat);
        mainFunc(zoo);
    }
    private static void themChim(Zoo zoo) {
        Bird bird = new Bird();
        bird.inputInfor();

        zoo.addAnimal(bird);
        mainFunc(zoo);
    }

    private static void makeAllSound(Zoo zoo) {
        zoo.makeAllSound();
        mainFunc(zoo);
    }

    private static void displayAllInfo(Zoo zoo) {
        zoo.displayAllInfor();
        mainFunc(zoo);
    }
}