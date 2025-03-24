
//Exception - try catch
import homework_day_9.Exception.CourseAlreadyRegisteredException;
import homework_day_9.Manager.CourseManager;
import homework_day_9.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Sinh vien A");
        student1.setId(12345);

        student2.setName("Sinh vien B");
        student2.setId(23456);

        manager.addStudent(student1);
        manager.addStudent(student2);

        //Try catch tim loi
        try {
            student1.registerCourse("Math");
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("XU LY XONG");
        }

        System.out.println("--------");
        try {
            student1.registerCourse("Math");
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("XU LY XONG");
        }
    }
}