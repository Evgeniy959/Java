package com.example.oop;

import java.util.Scanner;

public class Book {
    public String nameBook;
    public String author;
    public String yearRelease;
    public String namePublishingHouse;
    public String genre;
    public int pageCount;

    public void setNameBook(String nameBook) {
        this.nameBook=nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    Scanner in = new Scanner(System.in);
    public Book() {
        System.out.print("Введите название книги: ");
        this.nameBook = in.nextLine();
        System.out.print("Введите автора книги: ");
        this.author = in.nextLine();
        System.out.print("Введите  количество страниц: ");
        this.pageCount = in.nextInt();
        System.out.println(this.nameBook+", "+this.author+", "+this.pageCount+" стр");
    }

    public Book(String namePublishingHouse, String genre) {
        this.namePublishingHouse = namePublishingHouse;
        this.genre = genre;
        System.out.println(this.namePublishingHouse+", "+this.genre);
    }

    public Book(String nameBook, String author, String yearRelease) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearRelease = yearRelease;
        System.out.println("Название книги: "+this.nameBook+","+" автор: "+this.author+","+" год выпуска: "+this.yearRelease+" год");
    }

    public Book show(String nameBook, String author, String yearRelease) {
        this.nameBook=nameBook;
        this.author=author;
        this.yearRelease=yearRelease;
        return this;
    }

    public void show(){
        System.out.print("Введите название книги: ");
        this.nameBook = in.nextLine();
        System.out.print("Введите автора книги: ");
        this.author = in.nextLine();
        System.out.print("Введите  год выпуска: ");
        this.yearRelease = in.nextLine();
        System.out.println(this.nameBook+", "+this.author+", "+this.yearRelease+" год");
    }

    public Book show(String nameBook, String author, int pageCount) {
        this.setNameBook(nameBook);
        this.setAuthor(author);
        this.setPageCount(pageCount);
        return this;
    }
}


