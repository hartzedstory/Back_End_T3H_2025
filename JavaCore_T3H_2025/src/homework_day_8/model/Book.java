package homework_day_8.model;

import java.util.Scanner;

public abstract class Book {
    private int id;
    private int year;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("id: " + this.getId());
        System.out.println("title: " + this.getTitle());
        System.out.println("year: " + this.getYear());
        System.out.println("author: " + this.getAuthor());
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id sach: ");
        this.setId(input.nextInt());
        System.out.println("Nhap title sach: ");
        input.nextLine();
        this.setTitle(input.nextLine());
        System.out.println("Nhap year sach: ");
        this.setYear(input.nextInt());
        System.out.println("Nhap author sach: ");
        input.nextLine();
        this.setAuthor(input.nextLine());
    }
}
