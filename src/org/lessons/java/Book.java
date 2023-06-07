package org.lessons.java;

public class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publisher;

    public Book(String title, int pageCount, String author, String publisher) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int numPages) {
        this.pageCount = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Titolo: " + title +
                ", Numero pagine: " + pageCount +
                ", Autore: " + author +
                ", Editore: " + publisher;
    }

}
