package OnClassDemo;

import java.util.*;

public class OnClassMain {
    public static void main(String[] args) {
        Person p1 = new Person("P1", 001);
        Person p2 = new Person("P2", 002);
        Person p3 = new Person("P3", 003);
        Person p4 = new Person("P4", 004);

        //List array
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(p4);
        peopleList.add(p1);
        peopleList.add(p3);
        peopleList.add(p2);

        peopleList.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getId());
            System.out.println("---------------------");
        });


        //Tim kiem theo ten
        System.out.println("Nhap ten user can tim");
        Scanner scanner = new Scanner(System.in);
        String nameToSearch = scanner.nextLine();
        peopleList.forEach(person -> {
            if (person.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println("Thong tin cua nguoi can tim");
                System.out.println(person.getName());
                System.out.println(person.getId());
                System.out.println("---------------------");
            }
        });

        //Nhap ten va xoa di persoon do
        System.out.println("Nhap ten user can xoa");
        Scanner sc = new Scanner(System.in);
        String nameToRemove = sc.nextLine();
        peopleList.forEach(person -> {
            try {
                if (person.getName().equalsIgnoreCase(nameToRemove)) {
                    peopleList.remove(person);
                }
            } catch (Exception e) {
                System.out.println("KHÔNG TÌM THẤY THÀNH VIÊN NÀY");
            } finally {
                return;
            }
        });

        //Sort theo id
        peopleList.sort((o1,o2) -> o1.getId() - o2.getId());
        System.out.println("_________");
        for (Person p : peopleList) {
            System.out.println(p.getId());
            System.out.println(p.getName());
        }
    }
}
