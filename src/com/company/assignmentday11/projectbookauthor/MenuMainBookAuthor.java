package com.company.assignmentday11.projectbookauthor;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuMainBookAuthor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
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
}
