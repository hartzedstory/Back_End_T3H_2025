package buoi8.demo;

import buoi8.Interface.MyInterface;

public class ZooImplement  implements IZoo {

    @Override
    public void addAnimal(Animal animal) {
        System.out.println("Add animal");
    }

    @Override
    public void makeAllSound() {
        System.out.println("Make all sound");
    }

    @Override
    public void displayAllInfor() {
        System.out.println("Display all infor");
    }
}
