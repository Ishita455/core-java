package com.company.assignmentday11.projectbookauthor;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuMainBookAuthor {

    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void menu() {

        System.out.println("0 : Enter the no of Author and Books");
        System.out.println("1 : Add Authors");
        System.out.println("2 : Add Books");
        System.out.println("3 : Search a Book by Book Title");
        System.out.println("4 : Display a Book");
        System.out.println("5 : Display a Author");
        System.out.println("6 : Display all Books");
        System.out.println("7 : Display all authors");
        System.out.println("8 : Exit the Program");
        System.out.println("\n Enter the Choice");
        choice = scanner.nextInt();

    }

    public static void main(String[] args) {

        Book books[] = new Book[5];
        Author authors[] = new Author[5];
        Book book = null;
        Author author = null;
        int noOfAuthor = 0;
        int noOfBook = 0;

        while (true) {
            menu();

            switch (choice) {

                case 0:

                    System.out.println("Enter the total no of authors to be inserted");
                    noOfAuthor = scanner.nextInt();
                    authors = new Author[noOfAuthor];

                    System.out.println("Enter the total no of books to be inserted");
                    noOfBook = scanner.nextInt();
                    books = new Book[noOfBook];
                    break;

                case 1:

                    for (int i = 0; i < noOfAuthor; i++){
                    System.out.println("Add Author " + noOfAuthor + " Details");

                    System.out.println("Enter Author ID");
                    int authorId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the Author Name");
                    String authorName = scanner.nextLine();

                        author = new Author(authorId, authorName);
                        authors[i] = author;
                    }
                    break;

                case 2:

                    for (int i = 0; i < noOfBook; i++) {
                        System.out.println("Add Book " + noOfBook + " Details");

                        System.out.println("Enter Book ID");
                        int bookId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Enter the Book Title");
                        String bookTitle = scanner.nextLine();

                        System.out.println("Enter the Book Description");
                        String description = scanner.nextLine();

                        System.out.println("Enter The Book Price");
                        double price = scanner.nextDouble();

                        System.out.println("Available Authors");
                        System.out.println("------------------------------------------------------");
                        for (Author a : authors) {
                            System.out.println("Author ID: " + a.authorId);
                            System.out.println("Author Name: " + a.authorName);
                            System.out.println("------------------------------------------------------");
                        }
                        System.out.println("Enter the Author Id for this book");
                        int authId = scanner.nextInt();
                        Author tempAuthor = null;

                        for (Author a : authors) {
                            if (a.authorId == authId) {
                                tempAuthor = a;
                                break;
                            }
                            if (tempAuthor == null) {
                                System.out.println("No Match Found");
                            } else {
                                System.out.println("Your Chosen author name is: " + tempAuthor.authorName);
                            }

                        }
                        book = new Book(bookId, bookTitle, description, price, tempAuthor);
                        books[i] = book;
                    }
                    break;

                case 3:

                    System.out.println("Search a Book by Book Title");
                    scanner.nextLine();

                    System.out.println("Enter the Searching Book");
                    String searchBook = scanner.nextLine();

                    //System.out.println(searchBook);
                    for(int j=0; j<noOfBook; j++){
                    if (searchBook.contains(books[j].bookTitle)){
                        System.out.println("Match Found");
                        break;
                    }
                    else {
                        System.out.println("Match not Found");
                    }
                }
                    break;

                case 4:

                    System.out.println("Display a Book");
                    scanner.nextLine();

                    System.out.println("Enter the Book ID");
                    String bId = scanner.nextLine();

                    for(int j=0; j<noOfBook; j++){
                        if (bId.equals(books[j].bookId)){
                            System.out.println("Match Found");
                            System.out.println("Book Title: "+books[j].bookTitle);
                            System.out.println("Book Description: "+books[j].description);
                            System.out.println("Book price: "+books[j].price);
                            System.out.println("Book's Author: "+books[j].author);
                        }
                        else {
                            System.out.println("Match not Found");
                        }
                    }
                    break;

                case 5:

                    System.out.println("Display a Author");
                    scanner.nextLine();

                    System.out.println("Enter the Author ID");
                    int aId = scanner.nextInt();
                    scanner.nextLine();

                    for(int j=0; j<noOfAuthor; j++) {
                        Author currentAuthor = authors[j];
                        //if (aId==authors[j].authorId) {
                        if(aId == currentAuthor.authorId){
                            System.out.println("Match Found");
                            System.out.println("Author Name: " + authors[j].authorName);
                        } else {
                            System.out.println("Match not Found");
                        }
                    }
                    break;

                case 6:

                    System.out.println("Display all Books");
                    System.out.println("------------------------------------------------------");
                    for (Book b : books) {
                        System.out.println("Book ID: " + b.bookId);
                        System.out.println("Book Name: " + b.bookTitle);
                        System.out.println("Book Description: " + b.description);
                        System.out.println("Book price: " + b.price);
                        System.out.println("Book's Author: " + b.author.authorName);
                        System.out.println("------------------------------------------------------");
                    }
                    break;

                case 7:

                    System.out.println("Display all Authors");
                    System.out.println("------------------------------------------------------");
                    for (Author a : authors) {
                        System.out.println("Author ID: " + a.authorId);
                        System.out.println("Author Name: " + a.authorName);
                        System.out.println("------------------------------------------------------");
                    }
                    break;

                case 99:
                    System.out.println("Existing the Application");
                    System.exit(0);

                default:
                    System.out.println("Wrong Input!! Try Again");
                    break;
            }
        }
    }
}

































       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total no of books to be inserted");
        int noBook = scanner.nextInt();

        Book book[] = new Book[noBook];

        System.out.println("Enter the total no of authors to be inserted");
        int noAuthor = scanner.nextInt();

        Author author[] = new Author[noAuthor];

        for (int j=0; j<noAuthor; j++) {

            System.out.println("Enter the "+(j+1)+" author name");
            String an = scanner.nextLine();

            scanner.nextLine();
            System.out.println("Enter the "+(j+1)+" author Id");
            int aid = scanner.nextInt();
        }

            for (int i = 0; i < noBook; i++) {

                System.out.println("Enter the book " + (i + 1) + "Book Id");
                int bi = scanner.nextInt();

                scanner.nextLine();
                System.out.println("Enter the book " + (i + 1) + " book title");
                String bt = scanner.nextLine();

                scanner.nextLine();
                System.out.println("Enter the book " + (i + 1) + " description");
                String d = scanner.nextLine();

                scanner.nextLine();
                System.out.println("Enter the book " + (i + 1) + " price");
                double p = scanner.nextDouble();

                //book[i] = new Book(bi,bt,d,p,a);
            }

        System.out.println("Enter the options for 1: search book, 2: display book details,3: display author details, 4: all books, 5: all authors, 6: Exits ");
        int menu = scanner.nextInt();

        if (menu==1){
            
            System.out.println("Enter the searching Book");
            String searchBook = scanner.nextLine();
              for(int k=0; k< noBook; k++){
                  if(searchBook==book[k].bookTitle){
                      System.out.println("Book Found");
                      System.out.println("Book Details"+book[k].description);
                  }
                  else System.out.println("Book not found");
              }

                  System.out.println("Book Details");
              }
        }
}*/
