package homework_day_8;

import homework_day_8.model.Book;

public interface ILibrary {
    void addBook(Book book);
    void updateBook(int id, Book book);
    void deleteBook(int id);
    void searchByAuthor(String author);
    void displayAllBooks();
}
