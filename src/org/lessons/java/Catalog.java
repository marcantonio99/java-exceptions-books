package org.lessons.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBooks = 3;

        // Creazione dell'array per contenere i libri
        ArrayList<Book> bookArray = new ArrayList<>();

        // Input dei dati dei libri
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Inserisci i dati del libro " + (i + 1) + ":");
            try {
                Book book = createBookFromInput();
                bookArray.add(book);
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                i--; // Ripeti l'inserimento per lo stesso indice
            }
        }

        // Stampa l'array di libri
        System.out.println("\nArray di libri:");
        for (Book book : bookArray) {
            System.out.println(book.toString());
        }
    }

    private static Book createBookFromInput() throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Input dei dati del libro
        System.out.print("Titolo: ");
        String title = scanner.nextLine();

        System.out.print("Numero pagine: ");
        int pageCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Autore: ");
        String author = scanner.nextLine();

        System.out.print("Editore: ");
        String publisher = scanner.nextLine();

        // Validazione dei dati
        if (title.isEmpty() || author.isEmpty() || publisher.isEmpty()) {
            throw new Exception("Titolo, autore o editore vuoti");
        }

        if (pageCount <= 0) {
            throw new Exception("Numero pagine non valido");
        }

        // Creazione dell'oggetto Book
        return new Book(title, pageCount, author, publisher);
    }

}

