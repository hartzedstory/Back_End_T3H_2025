package homework_day_9;

import homework_day_9.Exception.CourseAlreadyRegisteredException;

import java.util.Scanner;

public class Student implements IStudent {
    private int id;
    private String name;
    private String[] courses = new String[10];
    private int courseCount = 10;

    @Override
    public void registerCourse(String courseName) throws CourseAlreadyRegisteredException {
        //Check o nho xem con vung luu tru khong
        this.validateArray();
        // Neu danh sach da co ten san, thi ban ve loi
        for (int i = 0; i < this.courses.length; i++) {
            if (this.courses[i] == courseName) {
                throw new CourseAlreadyRegisteredException(courseName, " da ton tai trong danh sach");
            } else {
                this.courses[i] = courseName;
            }
        }
    }

    @Override
    public void getCourses() {
        System.out.println("Danh sach cac mon da dang ky: ");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        try {
            this.setId(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Ma sinh vien sai dinh dang!");
        }

        System.out.println("Nhap ten sinh vien");
        this.setName(sc.nextLine());
    }

    @Override
    public void showInfo() {
        System.out.println("Thong tin sinh vien:");
        System.out.println("Ho va ten: " + this.getName());
        System.out.println("MSSV: " + this.getId());
        this.getCourses();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    private void validateArray() {
        if (this.courseCount == this.courses.length) {
            String[] newArr = new String[this.courses.length * 2];
            for (int i = 0; i < this.courses.length; i++) {
                newArr[i] = this.courses[i];
            }
        }
        this.courseCount++;
    }
}
