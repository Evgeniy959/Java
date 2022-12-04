package com.example.oop;

import java.util.Scanner;

public class Book {
    public String nameBook;
    public String author;
    public String yearRelease;
    public String namePublishingHouse;
    public String genre;
    public int pageCount;

    public Book() {

        /*Book.nameBook = "Роковой подарок,";
        Book.author = " Татьяна Устинова,";
        Book.yearRelease = " 2022,";
        Book.namePublishingHouse = " Эксмо,";
        Book.genre = " Детектив, ";
        Book.pageCount = 320;*/
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.nameBook = in.nextLine();
        System.out.print("Введите автора книги: ");
        this.author = in.nextLine();
        System.out.print("Введите  количество страниц: ");
        this.pageCount = in.nextInt();
        System.out.println(this.nameBook+", "+this.author+", "+this.pageCount+" стр");
    }



    public Book(String nameBook, String author, String yearRelease) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearRelease = yearRelease;
        System.out.println(this.nameBook+", "+this.author+", "+this.yearRelease+" год");
    }

    /*public Book(String nameBook, String author, int pageCount) {
        Scanner in = new Scanner(System.in);
        this.nameBook = nameBook;
        this.author = author;
        this.pageCount = pageCount;
    }*/
}


