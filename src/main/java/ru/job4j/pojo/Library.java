package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book idealJob = new Book("Ideal job", 384);
        Book cleanCode = new Book("Clean code", 464);
        Book cleanArchitecture = new Book("Clean architecture", 352);
        Book idealProgrammer = new Book("Ideal Programmer", 224);
        Book[] books = new Book[4];
        books[0] = idealJob;
        books[1] = cleanCode;
        books[2] = cleanArchitecture;
        books[3] = idealProgrammer;
        for (int index = 0; index < books.length; index++) {
        Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Replace Ideal Job to Ideal Programmer.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("ind " + i + " - " + books[i].getName() + " - " + book.getPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println("Найдена книга: " + "ind " + index + " - " + book.getName() + " - "
                        + book.getPages());
            }
        }
    }
}
