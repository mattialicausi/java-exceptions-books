package org.java.exercise.files;

public class Book {

    //campi
    private String title;
    private int nPages;
    private String author;
    private String publisher;

    //costruttori
    public Book(String title, int nPages, String author, String publisher) {

        try {
            this.title = title;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una stringa...");
        }

        try {
            this.nPages = nPages;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire un numero...");
        }

        try {
            this.author = author;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una Stringa");
        }

        try {
            this.publisher = publisher;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una Stringa");
        }
    }

    //getter e setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        try {
            this.title = title;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una stringa");
        }
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        try {
            this.nPages = nPages;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire un numero");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        try {
            this.author = author;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una stringa");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        try {
            this.publisher = publisher;
        } catch (Exception e) {
            throw new RuntimeException(e);
            System.out.println("Devi inserire una stringa");
        }
    }

    //metodi

    @Override
    public String toString() {
        return "title='" + title + '\'' + ", nPages=" + nPages + ", author='" + author + '\'' + ", publisher='" + publisher + '\'';
    }
}
