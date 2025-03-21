package homework_day_8;

import homework_day_8.model.Book;
import homework_day_8.model.BusinessBook;
import homework_day_8.model.ScienceBook;
import homeworks.Model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements ILibrary{
    static List<Book> bookList = new ArrayList<>();
    public void main() {
        System.out.println("Vui long chon chuc nang ung dung:");
        System.out.println("1 - Them sach moi");
        System.out.println("2 - Cap nhat thong tin:");
        System.out.println("3 - Xoa sach:");
        System.out.println("4 - Tim kiem");
        System.out.println("5 - Hien thi tat ca");
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
                System.out.println("Loai sach can them");
                System.out.println("1 - Sach kinh doanh");
                System.out.println("2 - Sach khoa hoc");
                Scanner input2 = new Scanner(System.in);
                int choice2 = input.nextInt();
                do {
                    if (choice2 < 1 || choice2 > 2) {
                        System.out.println("Vui long nhap trong khoan 1 toi 5");
                    }
                    if (choice2 == 5) {
                        break;
                    }
                } while (choice2 < 1 || choice2 > 2);

                switch (choice2) {
                    case 1:
                        BusinessBook book = new BusinessBook();
                        book.inputInfo();
                        addBook(book);
                    case 2:
                        ScienceBook scibook = new ScienceBook();
                        scibook.inputInfo();
                        addBook(scibook);
                }
            case 2:
                System.out.println("Thong tin sach moi");
                System.out.println("1 - Sach kinh doanh");
                System.out.println("2 - Sach khoa hoc");
                Scanner input3 = new Scanner(System.in);
                int choice3 = input.nextInt();
                do {
                    if (choice3 < 1 || choice3 > 2) {
                        System.out.println("Vui long nhap trong khoan 1 toi 5");
                    }
                    if (choice3 == 5) {
                        break;
                    }
                } while (choice3 < 1 || choice3 > 2);
                System.out.println("Cap nhat vao thong tin:");
                Scanner index = new Scanner(System.in);
                int i = index.nextInt();
                switch (choice3) {
                    case 1:
                        BusinessBook book = new BusinessBook();
                        book.inputInfo();
                        updateBook(i,book);
                    case 2:
                        ScienceBook scibook = new ScienceBook();
                        scibook.inputInfo();
                        updateBook(i,scibook);
                }
            case 3:
                System.out.println("Nhap ID can xoa:");
                Scanner id = new Scanner(System.in);
                deleteBook(id.nextInt());
            case 4:
                System.out.println("Nhap ten tac gia de tim kiem:");
                Scanner ten = new Scanner(System.in);
                searchByAuthor(ten.nextLine());
            case 5:
                displayAllBooks();
        }
    }



    @Override
    public void addBook(Book book) {
        this.bookList.add(book);
    }

    @Override
    public void updateBook(int id, Book book) {
        for (int i = 0; i < this.bookList.size(); i++) {
            if (this.bookList.get(i).getId() == id) {
                this.bookList.set(i, book);
                System.out.println("CAP NHAT THANH CONG");
                return;
            }
            System.out.println("KHONG TIM THAY THONG TIN SACH!");
        }
    }

    @Override
    public void deleteBook(int id) {
        for (int i = 0; i < this.bookList.size(); i++) {
            if (this.bookList.get(i).getId() == id) {
                this.bookList.remove(i);
                System.out.println("XOA THANH CONG");
                return;
            }
            System.out.println("KHONG TIM THAY THONG TIN SACH DE XOA!");
        }
    }

    @Override
    public void searchByAuthor(String author) {
        Book[] temp = new Book[this.bookList.size()];
        for (int i = 0; i < this.bookList.size(); i++) {
            if (this.bookList.get(i).getAuthor() == author) {
                this.bookList.get(i).displayInfo();
                System.out.println("---------------------");;
            }
            System.out.println("KHONG TIM THAY THONG TIN SACH DE XOA!");
        }
    }

    @Override
    public void displayAllBooks() {
        for (int i = 0; i < this.bookList.size(); i++) {
                this.bookList.get(i).displayInfo();
                System.out.println("---------------------");
        }
    }


}
