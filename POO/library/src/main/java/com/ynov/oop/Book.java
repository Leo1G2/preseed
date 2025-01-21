package com.ynov.oop;


public class Book {
    private String bookTitle;
    private String bookAutor;
    private int yearRelease;
    private int numberofpages;
    private boolean isAvailable;

    public Book(String newTitle,
    String newAutor,
    int newRelease, 
    int newNumberofpages){
        this.isAvailable = true;
    }
    public void borrow() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Vous empruntez le livre" + this.bookTitle);
        } else {
            System.out.println("Le livre " + this.bookTitle+"n'est pas disponible");
        }
    }
    public void giveBack() {
        if(this.isAvailable == false) {
            this.isAvailable = true;
            System.out.println(numberofpages);

        }
    }
}