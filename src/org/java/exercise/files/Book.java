package org.java.exercise.files;

public class Book {

    //campi
    private String title;
    private int nPages;
    private String author;
    private String publisher;

    //costruttori
    public Book(String title, int nPages, String author, String publisher) {

        checkString(title, "Titolo ");
        this.title = title;

        checkNumbers(nPages);
        this.nPages = nPages;

        checkString(author, "Autore ");
        this.author = author;

        checkString(publisher, "Editore ");
        this.publisher = publisher;
    }

    //getter e setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        checkString(title, "Titolo");
        this.title = title;
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        checkNumbers(nPages);
        this.nPages = nPages;


    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        checkString(author, "Autore");
        this.author = author;

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        checkString(publisher, "Editore ");
        this.publisher = publisher;
    }

    //metodi
    private void checkString(String stringa, String subject) {
        if(stringa ==null || stringa.length() == 0) {
            throw new NullPointerException(subject + "non può essere vuoto");
        }
    }

    private void checkNumbers(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("Le pagine non possono essere minori o uguali a 0");
        }
    }
    @Override
    public String toString() {
        return "title='" + title + '\'' + ", nPages=" + nPages + ", author='" + author + '\'' + ", publisher='" + publisher + '\'';
    }
}
