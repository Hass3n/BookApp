package com.example.hassan.book;

public class Date extends java.util.Date {

    int image;
    String book_name;


    public Date(int image, String book_name) {
        this.image = image;
        this.book_name = book_name;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String boork_name) {
        this.book_name = boork_name;
    }


}
