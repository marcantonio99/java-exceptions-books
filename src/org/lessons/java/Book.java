package org.lessons.java;

public class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publisher;

    public Book(String title, int pageCount, String author, String publisher) {
        setTitle(title);
        setPageCount(pageCount);
        setAuthor(author);
        setPublisher(publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto");
        }
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Il numero di pagine non deve essere zero");
        }
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Autore non può essere vuoto");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Editore non può essere vuoto");
        }
        this.publisher = publisher;
    }
}
