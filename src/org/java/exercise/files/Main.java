package org.java.exercise.files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //chiedo quanti libri vuole aggiungere
        System.out.print("Ciao, quanti libri vuoi aggiungere? ");

        boolean nValid = false;
        int n = 0;

        while (!nValid) {
            try {
                n = Integer.parseInt(scan.nextLine());
                nValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero ");
            }
        }

        Book[] list = new Book[n];

        //chiedo i dati all'utente per creare i libri ed inserirli in list
        for (int i = 0; i < n; i++) {

            System.out.print("Titolo: ");
            String title = scan.nextLine();

            System.out.println("Numero di pagine: ");
            int nPages = Integer.parseInt(scan.nextLine());

            System.out.print("Autore: ");
            String author = scan.nextLine();

            System.out.print("Editore: ");
            String publisher = scan.nextLine();

            try {
                Book b = new Book(title, nPages, author, publisher);
                list[i] = b;
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        for (Book book : list) {
            System.out.println(book);
        }

        scan.close();

    }
}
