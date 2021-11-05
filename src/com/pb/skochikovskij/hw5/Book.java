package com.pb.skochikovskij.hw5;

/*
* Класс Book хранит такую информацию о книге:
- название
- автор книги
- год издания*/
public class Book {

    private String bookName;
    private String author;
    private int year;

    public Book(String bookName, String author,int year  ) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    public Book() {
        this.bookName = "Красивая";
        this.author = "Очень известный";
        this.year = 1900;
        bookCount++;
    }

    private static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        if (bookName == null || bookName.isEmpty()) {
            return;
        } else {
            this.bookName = bookName;
        }
        bookCount++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String  getInfo() {
        return "[Назнивае книги: " + bookName + " , Автор произведения " + author + ", год выпуска книги: " + year + "г.]";

    }
}
