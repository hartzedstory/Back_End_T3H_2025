import buoi5.Animal;
import buoi5.Car;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Set gia tri cho cac thuoc tinh
       Car xe1 = new Car();
       xe1.namSanXuat = 2025;
       xe1.ten = "Toyota";
       xe1.mauSac = "RED";
       xe1.getInfor();

       Car xe2 = new Car();
        xe2.namSanXuat = 2024;
        xe2.ten = "BMW";
        xe2.mauSac = "YELLOW";
        xe2.getInfor();

        Car xe3 = new Car("DO",2025,"ABC");

        //Khai bao danh sach model
        Car[] danhSachXe = new Car[6];
        for (int i = 0; i < 6; i++) {
            Car car = new Car();
            car.ten = "Xe " + i;
            car.namSanXuat = i + 2000;
            car.mauSac = "Mau " + i;
            danhSachXe[i] = car;
        }

        System.out.println(danhSachXe);

        OnClasEx1();
    }

    private static void OnClasEx1() {
        Animal[] animalList = new Animal[10];
        for (int i = 0; i < animalList.length; i++) {
            Animal animal = new Animal();
            animal.setName("animal " + i);
            animal.setAge(i + 2000);
            animal.setHeight(i + 20);
            animal.setFetherColor(String.valueOf(i));
            animalList[i] = animal;
        }

        System.out.println("Danh sach dong vat dang co");
        for (int j = 0; j < animalList.length; j++) {
            System.out.println(animalList[j].getAge());
            System.out.println(animalList[j].getFetherColor());
            System.out.println(animalList[j].getHeight());
            System.out.println(animalList[j].getName());
            System.out.println("============================");
        }
    }
}